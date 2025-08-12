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


typedef struct {
    Show* array[MAX_SHOWS];
    int n;
} Lista;

void criarLista(Lista* l) {
    l->n = 0;
}

void inserir(Lista* l, Show* s, int pos) {
    if(l->n < MAX_SHOWS && pos >= 0 && pos <= l->n) {
        for(int i = l->n; i > pos; i--) {
            l->array[i] = l->array[i - 1];
        }
        l->array[pos] = s;
        l->n++;
    }
}
void inserirInicio(Lista* l, Show* s) {
    inserir(l, s, 0);
}
void inserirFim(Lista* l, Show* s) {
    if(l->n < MAX_SHOWS) {
        l->array[l->n++] = s;
    }
}

Show* remover(Lista* l, int pos) {
    if(pos >= 0 && pos < l->n) {
        Show* removido = l->array[pos];
        for(int i = pos; i < l->n - 1; i++) {
            l->array[i] = l->array[i + 1];
        }
        l->n--;
        return removido;
    }
    return NULL;
}
Show* removerInicio(Lista* l) {
    return remover(l, 0);
}
Show* removerFim(Lista* l) {
    if(l->n > 0) {
        l->n--;
        return l->array[l->n];
    }
    return NULL;
}

void mostrarLista(Lista* l) {
    for (int i = 0; i < l->n; i++) {
        imprimirShow(l->array[i]);
    }
}



int main() {
    FILE* csvFile = fopen("/tmp/disneyplus.csv", "r");
    //FILE* csvFile = fopen("/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv", "r");

    if(csvFile == NULL) {
        perror("Erro ao abrir o arquivo");
        return 1;
    }

    Show* shows[MAX_SHOWS];     //Array de Show Principal
    int showCount = 0;

    char input[MAX_LINE];
    fgets(input, MAX_LINE, csvFile); //pula cabeçalho

    while(fgets(input, MAX_LINE, csvFile) && showCount < MAX_SHOWS) {
        input[strcspn(input, "\n")] = 0;
        shows[showCount++] = lerShow(input);
    }

    fclose(csvFile);


    Show* base[300];        //Array manipulável
    int baseCount = 0;

    char id[6];

    fgets(id, 6, stdin);
    id[strcspn(id, "\n")] = 0;

    while(strcmp(id, "FIM") != 0) {

        for(int i = 0; i < showCount; i++) {
            if(shows[i] != NULL && strcmp(getShowId(shows[i]), id) == 0) {

                base[baseCount++] = shows[i];
                break;
            }
        }

        fgets(id, 6, stdin);
        id[strcspn(id, "\n")] = 0;
    }

    Lista* disney = (Lista*)malloc(sizeof(Lista)); 
    criarLista(disney);
    for(int i = 0; i < baseCount; i++) inserirFim(disney, base[i]);

    int qt; scanf("%d", &qt);
    char linha[30];
    for(; qt >= 0; qt--) {
        fgets(linha, sizeof(linha), stdin);
        linha[strcspn(linha, "\n")] = '\0';

        if(strncmp(linha, "II ", 3) == 0) {
            char idOp[10];
            sscanf(linha + 3, "%s", idOp);
            for(int j = 0; j < showCount; j++) {
                if(strcmp(getShowId(shows[j]), idOp) == 0) {
                    inserirInicio(disney, shows[j]); break;
                }
            }
        }
        else if(strncmp(linha, "IF ", 3) == 0) {
            char idOp[10];
            sscanf(linha + 3, "%s", idOp);
            for(int j = 0; j < showCount; j++) {
                if(strcmp(getShowId(shows[j]), idOp) == 0) {
                    inserirFim(disney, shows[j]); break;
                }
            }
        } 
        else if(strncmp(linha, "I* ", 3) == 0) {
            int pos; char idOp[10];
            sscanf(linha + 3, "%d %s", &pos, idOp);
            for(int j = 0; j < showCount; j++) {
                if(strcmp(getShowId(shows[j]), idOp) == 0) {
                    inserir(disney, shows[j], pos); break;
                }
            }
        } 
        else if(strcmp(linha, "RI") == 0) {
            Show* removido = removerInicio(disney);
            printf("(R) %s\n", removido->title);
        }
        else if(strcmp(linha, "RF") == 0) {
            Show* removido = removerFim(disney);
            printf("(R) %s\n", removido->title);
        } 
        else if(strncmp(linha, "R* ", 3) == 0) {
            int pos;
            sscanf(linha + 3, "%d", &pos);
            Show* removido = remover(disney, pos);
            printf("(R) %s\n", removido->title);
        }
    }

    mostrarLista(disney);

    for(int i = 0; i < showCount; i++) {
        if(shows[i]) freeShow(shows[i]);
    }
    free(disney);


    return 0;
}