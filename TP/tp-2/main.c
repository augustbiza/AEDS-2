#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX_LINE 2048
#define MAX_INPUT 64
#define MAX_SHOWS 1000
#define MAX_CAST 50
#define MAX_LISTED 50

// Struct Show
typedef struct {
    char* show_id;
    char* type;
    char* title;
    char* director;
    char* cast[MAX_CAST];
    int cast_count;
    char* country;
    char* date_added;
    int release_year;
    char* rating;
    char* duration;
    char* listed_in[MAX_LISTED];
    int listed_in_count;
} Show;

// Funções auxiliares
char* str_duplicate(const char* src) {
    if (!src) return NULL;
    char* dup = malloc(strlen(src) + 1);
    strcpy(dup, src);
    return dup;
}

// Sets
void setShowId(Show* s, const char* id) { s->show_id = str_duplicate(id); }
void setType(Show* s, const char* type) { s->type = str_duplicate(type); }
void setTitle(Show* s, const char* title) { s->title = str_duplicate(title); }
void setDirector(Show* s, const char* dir) { s->director = str_duplicate(dir); }
void setCountry(Show* s, const char* country) { s->country = str_duplicate(country); }
void setDateAdded(Show* s, const char* date) { s->date_added = str_duplicate(date); }
void setReleaseYear(Show* s, int year) { s->release_year = year; }
void setRating(Show* s, const char* rating) { s->rating = str_duplicate(rating); }
void setDuration(Show* s, const char* duration) { s->duration = str_duplicate(duration); }

void setCast(Show* s, char* parts[], int count) {
    s->cast_count = count;
    for (int i = 0; i < count; i++) {
        s->cast[i] = str_duplicate(parts[i]);
    }
}

void setListedIn(Show* s, char* parts[], int count) {
    s->listed_in_count = count;
    for (int i = 0; i < count; i++) {
        s->listed_in[i] = str_duplicate(parts[i]);
    }
}

// Gets
char* getShowId(Show* s) { return s->show_id; }

char* getCast(Show* s) {
    if (s->cast_count == 0) return str_duplicate("[NaN]");

    char* result = malloc(1024);
    strcpy(result, "[");

    for (int i = 0; i < s->cast_count; i++) {
        strcat(result, s->cast[i]);
        if (i < s->cast_count - 1) strcat(result, ", ");
    }
    strcat(result, "]");
    return result;
}

char* getListedIn(Show* s) {
    char* result = malloc(1024);
    strcpy(result, "[");

    for (int i = 0; i < s->listed_in_count; i++) {
        strcat(result, s->listed_in[i]);
        if (i < s->listed_in_count - 1) strcat(result, ", ");
    }
    strcat(result, "]");
    return result;
}

// Imprimir
void imprimirShow(Show* s) {
    char* castStr = getCast(s);
    char* listedStr = getListedIn(s);

    printf("=> %s ## %s ## %s ## %s ## %s ## %s ## %s ## %d ## %s ## %s ## %s ##\n",
        s->show_id ? s->show_id : "NaN",
        s->title ? s->title : "NaN",
        s->type ? s->type : "NaN",
        (s->director && strlen(s->director) > 0) ? s->director : "NaN",
        castStr,
        (s->country && strlen(s->country) > 0) ? s->country : "NaN",
        (s->date_added && strlen(s->date_added) > 0) ? s->date_added : "NaN",
        s->release_year,
        (s->rating && strlen(s->rating) > 0) ? s->rating : "NaN",
        (s->duration && strlen(s->duration) > 0) ? s->duration : "NaN",
        listedStr
    );

    free(castStr);
    free(listedStr);
}

// Criar show a partir de linha CSV
Show* createShowFromCSV(char* line) {
    Show* s = malloc(sizeof(Show));
    memset(s, 0, sizeof(Show));

    char* tokens[12];
    int t = 0;

    int inQuotes = 0;
    char* token = malloc(MAX_LINE);
    int pos = 0;

    for (int i = 0; line[i] != '\0'; i++) {
        char c = line[i];

        if (c == '"') {
            inQuotes = !inQuotes;
        } else if (c == ',' && !inQuotes) {
            token[pos] = '\0';
            tokens[t++] = str_duplicate(token);
            pos = 0;
        } else {
            token[pos++] = c;
        }
    }
    token[pos] = '\0';
    tokens[t++] = str_duplicate(token);
    free(token);

    // Aplicar setters
    setShowId(s, tokens[0]);
    setType(s, tokens[1]);
    setTitle(s, tokens[2]);
    setDirector(s, tokens[3]);

    char* castParts[MAX_CAST];
    int castCount = 0;
    char* castTok = strtok(tokens[4], ",");
    while (castTok) {
        while (isspace(*castTok)) castTok++;
        castParts[castCount++] = castTok;
        castTok = strtok(NULL, ",");
    }
    setCast(s, castParts, castCount);

    setCountry(s, tokens[5]);
    setDateAdded(s, tokens[6]);
    setReleaseYear(s, atoi(tokens[7]));
    setRating(s, tokens[8]);
    setDuration(s, tokens[9]);

    char* listParts[MAX_LISTED];
    int listCount = 0;
    char* listTok = strtok(tokens[10], ",");
    while (listTok) {
        while (isspace(*listTok)) listTok++;
        listParts[listCount++] = listTok;
        listTok = strtok(NULL, ",");
    }
    setListedIn(s, listParts, listCount);

    for (int i = 0; i < 12; i++) {
        if (i != 4 && i != 10) free(tokens[i]);
    }

    return s;
}

// Free
void freeShow(Show* s) {
    if (!s) return;

    free(s->show_id);
    free(s->type);
    free(s->title);
    free(s->director);
    free(s->country);
    free(s->date_added);
    free(s->rating);
    free(s->duration);

    for (int i = 0; i < s->cast_count; i++) {
        free(s->cast[i]);
    }

    for (int i = 0; i < s->listed_in_count; i++) {
        free(s->listed_in[i]);
    }

    free(s);
}

// Main
int main() {
    //FILE* file = fopen("/tmp/disneyplus.csv", "r");
    FILE* file = fopen("/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv", "r");

    if (!file) {
        perror("Erro ao abrir o arquivo");
        return 1;
    }

    Show* shows[MAX_SHOWS];
    int showCount = 0;

    char line[MAX_LINE];
    fgets(line, MAX_LINE, file); // pula cabeçalho

    while (fgets(line, MAX_LINE, file) && showCount < MAX_SHOWS) {
        line[strcspn(line, "\n")] = 0;
        shows[showCount++] = createShowFromCSV(line);
    }

    fclose(file);

    char input[MAX_INPUT];
    fgets(input, MAX_INPUT, stdin);
    input[strcspn(input, "\n")] = 0;

    while (strcmp(input, "FIM") != 0) {
        int found = 0;

        for (int i = 0; i < showCount; i++) {
            if (strcmp(getShowId(shows[i]), input) == 0) {
                imprimirShow(shows[i]);
                found = 1;
                break;
            }
        }

        fgets(input, MAX_INPUT, stdin);
        input[strcspn(input, "\n")] = 0;
    }

    for (int i = 0; i < showCount; i++) {
        freeShow(shows[i]);
    }

    return 0;
}
