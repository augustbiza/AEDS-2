// Q-02 - Classe Show - C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

//constantes
#define csvFile "/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv"
//#define csvFile "/tmp/disneyplus.csv"
#define MAXShow 1368
#define MAXLinha 500


typedef struct {

    int day;
    int month;
    int year;

}LocalDate;

typedef struc {

    char* show_id;
    char* type;
    char* tytle;
    char* director;
    char** cast;
    int qtCast;             //
    char* country;
    LocalDate date_added;
    int release_year;
    char* rating;
    char* duration;
    char** listed_in;
    int qtListedIn;        //


}Show;


Show shows[MAXShow];
int showLength = 0;

Show show_newBlank() {

    Show show;

    
}


Show show_read(char* line) {

    Show show = show_newBlank();
}


void startShow() {

    FILE* fp;
    char* line = NULL;
    size_t len = 0;
    ssize_t read;

    fp = fopen(csvFile, "r");

    if(fp = NULL) {
        perror("x Error opening file");
        exit(EXIT_FAILURE);
    }

    getline(&line, &len, fp);   //pular o cabeçalho


    while((read = getline(&line, &len, fp)) != -1) {

        Show show = show_read(line);


    }

}

int main(void) {

    startShow();

    return 0;
}