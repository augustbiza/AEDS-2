#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int procuraMaiuscula(char *palavra) {
    int n = strlen(palavra), qtMa = 0;
    for(int i = 0; i < n; i++) {
        if(palavra[i] >= 65 && palavra[i] <= 90) qtMa++;
    }
    return qtMa;
}

int main(void) {

    char palavra[1000];

    do{
        scanf(" %[^\n]", palavra);
        if(strcmp(palavra, "FIM") != 0) {
            printf("%d\n",procuraMaiuscula(palavra));
        }

    }while(strcmp(palavra, "FIM") != 0);


    return 0;
}