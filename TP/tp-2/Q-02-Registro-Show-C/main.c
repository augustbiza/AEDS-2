// Q-02 - Classe Show - C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

typedef struct {

    int day, month, year;
}LocalDate;


typedef struct {

    char show_id[6];
    char type[7];
    char title[100];
    char director[100];
    char cast[10][50];
    char country[20];
    LocalDate date;
    int release_year;
    char rating[7];
    char duration[10];
    char listed_in[5][50];
    char description[200];

}Show;



int main(void) {

    

    return 0;
}