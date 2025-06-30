// Struct Show - C
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <time.h>
#define MAX_SHOWS 1368      //qt de shows
#define MAX_LINE 500        //qt de char de uma linha

typedef struct {
    char* showId;
    char* type;
    char* title;
    char* director;
    char** cast;
    char* country;
    time_t dateAdded;
    int releaseYear;
    char* rating;
    char* duration;
    char** listedIn;

}Show;

//construtor
Show* criarShow(char* line) {}

int main(void) {

    FILE csvFile = fopen("/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv", "r");
    if(csvFile == NULL) {
        perror("Error opening file")
    }

    Show* shows[MAX_SHOWS];                                                     //Array de Shows do csv
    int countShow = 0;                                                          //contar o número de Show

    char line[MAX_LINE];
    fgets(line, MAX_LINE, csvFile);                                             //pular o cabeçalho do arquivo

    while(fgets(line, MAX_LINE, csvFile) != NULL && showCount < MAX_SHOWS) {
        line[strcspn(line, "\n")] = '\0';
        shows[showCount++] = criarShow(line);
    }
    fclose(csvFile);

    return 0;
}