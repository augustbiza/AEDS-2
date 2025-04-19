#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>
#define MAX_LINE 500
#define MAX_ID 6
#define MAX_SHOWS 1368
#define MAX_CAST 10
#define MAX_LISTED 10

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

//copia structs
char* copyShow(const char* atributo) {
    if(atributo == NULL) return NULL;

    char* copy = malloc(strlen(atributo) + 1);
    strcpy(copy, atributo);

    return copy;
}
//ordenar
void insertionSort(char* arr[], int n) {
    for(int i = 1; i < n; i++) {
        char* aux = arr[i];
        int j = i - 1;

        while(j >= 0 && strcmp(arr[j], aux) > 0) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = aux;
    }
}

//sets
void setShowId(Show* s, const char* id) { s->show_id = copyShow(id); }
void setType(Show* s, const char* type) { s->type = copyShow(type); }
void setTitle(Show* s, const char* title) { s->title = copyShow(title); }
void setDirector(Show* s, const char* dir) { s->director = copyShow(dir); }
void setCountry(Show* s, const char* country) { s->country = copyShow(country); }
void setDateAdded(Show* s, const char* date) { s->date_added = copyShow(date); }
void setReleaseYear(Show* s, int year) { s->release_year = year; }
void setRating(Show* s, const char* rating) { s->rating = copyShow(rating); }
void setDuration(Show* s, const char* duration) { s->duration = copyShow(duration); }

void setCast(Show* s, char* parts[], int count) {
    s->cast_count = count;
    for(int i = 0; i < count; i++) {
        s->cast[i] = copyShow(parts[i]);
    }
    insertionSort(s->cast, s->cast_count);
}

void setListedIn(Show* s, char* parts[], int count) {
    s->listed_in_count = count;
    for(int i = 0; i < count; i++) {
        s->listed_in[i] = copyShow(parts[i]);
    }
    insertionSort(s->listed_in, s->listed_in_count);
}

//gets
char* getShowId(Show* s) { return s->show_id; }

char* getCast(Show* s) {
    if(s->cast_count == 0) return copyShow("[NaN]");

    char* result = malloc(1024);
    strcpy(result, "[");

    for(int i = 0; i < s->cast_count; i++) {
        strcat(result, s->cast[i]);
        if (i < s->cast_count - 1) strcat(result, ", ");
    }
    strcat(result, "]");
    return result;
}

char* getListedIn(Show* s) {
    char* result = malloc(1024);
    strcpy(result, "[");

    for(int i = 0; i < s->listed_in_count; i++) {
        strcat(result, s->listed_in[i]);
        if (i < s->listed_in_count - 1) strcat(result, ", ");
    }
    strcat(result, "]");
    return result;
}

//print
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

//"construtor"

Show* lerShow(char* linha) {

    Show* s = malloc(sizeof(Show));
    memset(s, 0, sizeof(Show));
    //Show* s = calloc(1, sizeof(Show));

    char* itens[12];
    int t = 0;

    int emAspas = 0;
    char* item = malloc(MAX_LINE);
    int pos = 0;

    for(int i = 0; linha[i] != '\0'; i++) {
        char c = linha[i];

        if(c == '"') {
            emAspas = !emAspas;
        } 
        else if(c == ',' && !emAspas) {
            item[pos] = '\0';
            itens[t++] = copyShow(item);
            pos = 0;
        } 
        else {
            item[pos++] = c;
        }
    }
    
    item[pos] = '\0';
    itens[t++] = copyShow(item);
    free(item);

    setShowId(s, itens[0]);
    setType(s, itens[1]);
    setTitle(s, itens[2]);
    setDirector(s, itens[3]);

    char* castParts[MAX_CAST];
    int castCount = 0;
    char* castTok = strtok(itens[4], ",");
    while (castTok) {
        while (isspace(*castTok)) castTok++;
        castParts[castCount++] = castTok;
        castTok = strtok(NULL, ",");
    }
    setCast(s, castParts, castCount);

    setCountry(s, itens[5]);
    setDateAdded(s, itens[6]);
    setReleaseYear(s, atoi(itens[7]));
    setRating(s, itens[8]);
    setDuration(s, itens[9]);

    char* listParts[MAX_LISTED];
    int listCount = 0;
    char* listTok = strtok(itens[10], ",");
    while(listTok) {
        while (isspace(*listTok)) listTok++;
        listParts[listCount++] = listTok;
        listTok = strtok(NULL, ",");
    }
    setListedIn(s, listParts, listCount);

    for(int i = 0; i < 12; i++) {
        if(i != 4 && i != 10) free(itens[i]);
    }

    return s;
}

//free geral
void freeShow(Show* s) {
    if(s == NULL) return;   

    free(s->show_id);
    free(s->type);
    free(s->title);
    free(s->director);
    free(s->country);
    free(s->date_added);
    free(s->rating);
    free(s->duration);

    for(int i = 0; i < s->cast_count; i++) {
        free(s->cast[i]);
    }

    for(int i = 0; i < s->listed_in_count; i++) {
        free(s->listed_in[i]);
    }

    free(s);
}


int main() {
    //FILE* csvFile = fopen("/tmp/disneyplus.csv", "r");
    FILE* csvFile = fopen("/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv", "r");

    if(csvFile == NULL) {
        perror("Erro ao abrir o arquivo");
        return 1;
    }

    Show* shows[MAX_SHOWS];
    int showCount = 0;

    char line[MAX_LINE];
    fgets(line, MAX_LINE, csvFile); //pula cabeçalho

    while(fgets(line, MAX_LINE, csvFile) && showCount < MAX_SHOWS) {
        line[strcspn(line, "\n")] = 0;
        shows[showCount++] = lerShow(line);
    }

    fclose(csvFile);

    char id[MAX_ID];
    fgets(id, MAX_ID, stdin);

    id[strcspn(id, "\n")] = 0; //remove '\n'

    while(strcmp(id, "FIM") != 0) {
        
        for(int i = 0; i < showCount; i++) {
            if(strcmp(getShowId(shows[i]), id) == 0) {
                imprimirShow(shows[i]);
                break;
            }
        }
        
        fgets(id, MAX_ID, stdin);
        id[strcspn(id, "\n")] = 0; //remove '\n'
    }

    for(int i = 0; i < showCount; i++) {
        freeShow(shows[i]);
    }

    return 0;
}