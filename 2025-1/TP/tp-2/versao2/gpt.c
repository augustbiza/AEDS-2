#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE 1024
#define MAX_SHOWS 1368

typedef struct {
    char* show_id;
    char* type;
    char* title;
    char* director;
    char** cast;
    int cast_count;
    char* country;
    char* date_added;
    int release_year;
    char* rating;
    char* duration;
    char** listed_in;
    int listed_in_count;
} Show;

// Lê um campo do CSV, preenchendo "NaN" se estiver vazio
char* parse_field(char** cursor) {
    if (*cursor == NULL) return strdup("NaN");

    char* start = *cursor;
    char* field;

    if (*start == '"') {
        start++;
        char* end = strchr(start, '"');
        if (!end) return strdup("NaN");
        *end = '\0';
        field = strdup(strlen(start) == 0 ? "NaN" : start);
        *cursor = end + 1;
        if (**cursor == ',') (*cursor)++;
    } else {
        char* end = strchr(start, ',');
        if (end) {
            *end = '\0';
            field = strdup(strlen(start) == 0 ? "NaN" : start);
            *cursor = end + 1;
        } else {
            field = strdup(strlen(start) == 0 ? "NaN" : start);
            *cursor = NULL;
        }
    }

    return field;
}

// Quebra campo com vírgulas em lista de strings
void split_list(char* field, char*** list, int* count) {
    int max = 20;
    *list = malloc(max * sizeof(char*));
    *count = 0;

    char* token = strtok(field, ",");
    while (token) {
        while (*token == ' ') token++;
        (*list)[(*count)++] = strdup(token);
        token = strtok(NULL, ",");
    }
}

// Cria Show* a partir de uma linha CSV
Show* criarShow(char* linha) {
    Show* s = malloc(sizeof(Show));
    memset(s, 0, sizeof(Show));

    char* cursor = linha;

    s->show_id    = parse_field(&cursor);
    s->type       = parse_field(&cursor);
    s->title      = parse_field(&cursor);
    s->director   = parse_field(&cursor);

    char* cast_raw = parse_field(&cursor);
    if (strcmp(cast_raw, "NaN") != 0)
        split_list(cast_raw, &s->cast, &s->cast_count);
    free(cast_raw);

    s->country     = parse_field(&cursor);
    s->date_added  = parse_field(&cursor);

    char* year_str = parse_field(&cursor);
    s->release_year = (strcmp(year_str, "NaN") != 0) ? atoi(year_str) : 0;
    free(year_str);

    s->rating     = parse_field(&cursor);
    s->duration   = parse_field(&cursor);

    char* listed_raw = parse_field(&cursor);
    if (strcmp(listed_raw, "NaN") != 0)
        split_list(listed_raw, &s->listed_in, &s->listed_in_count);
    free(listed_raw);

    return s;
}

// Libera memória de um Show
void liberarShow(Show* s) {
    free(s->show_id);
    free(s->type);
    free(s->title);
    free(s->director);
    for (int i = 0; i < s->cast_count; i++) free(s->cast[i]);
    free(s->cast);
    free(s->country);
    free(s->date_added);
    free(s->rating);
    free(s->duration);
    for (int i = 0; i < s->listed_in_count; i++) free(s->listed_in[i]);
    free(s->listed_in);
    free(s);
}

// Imprime um Show para debug
void printShow(Show* s) {
    printf("ID: %s\n", s->show_id);
    printf("Tipo: %s\n", s->type);
    printf("Título: %s\n", s->title);
    printf("Diretor: %s\n", s->director);
    printf("Elenco (%d): ", s->cast_count);
    for (int i = 0; i < s->cast_count; i++) {
        printf("%s%s", s->cast[i], (i < s->cast_count - 1) ? ", " : "\n");
    }
    printf("País: %s\n", s->country);
    printf("Adicionado: %s\n", s->date_added);
    printf("Ano: %d\n", s->release_year);
    printf("Classificação: %s\n", s->rating);
    printf("Duração: %s\n", s->duration);
    printf("Categorias (%d): ", s->listed_in_count);
    for (int i = 0; i < s->listed_in_count; i++) {
        printf("%s%s", s->listed_in[i], (i < s->listed_in_count - 1) ? ", " : "\n");
    }
    printf("---------------------------\n");
}

// Função principal
int main(void) {
    FILE* csvFile = fopen("/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv", "r");
    if (csvFile == NULL) {
        perror("Erro ao abrir o arquivo");
        return 1;
    }

    Show* shows[MAX_SHOWS];
    int showCount = 0;

    char line[MAX_LINE];
    fgets(line, MAX_LINE, csvFile); // pula cabeçalho

    while (fgets(line, MAX_LINE, csvFile) != NULL && showCount < MAX_SHOWS) {
        line[strcspn(line, "\n")] = '\0';
        shows[showCount++] = criarShow(line);
    }

    fclose(csvFile);

    // Testar os primeiros 3 shows
    for (int i = 0; i < 3 && i < showCount; i++) {
        printShow(shows[i]);
    }

    // Liberação
    for (int i = 0; i < showCount; i++) {
        liberarShow(shows[i]);
    }

    return 0;
}
