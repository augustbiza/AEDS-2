//Ciframento de César em C (iterativo)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void lerStr(char* str) {

    scanf(" %[^\n]", str);

}


/*
void charEspecial(char* str, int tam) {
    for(int i = 0; i < tam; i++) {
        if(str[i] < 32 || str[i > 127]) str[i] = '';
    }
}*/

void ciframentoCesar(char* str, int tam) {
    for(int i = 0; i < tam; i++) {
        if(str[i] >= 32 || str[i] <= 127) str[i] += 3;
    }
}


int main(void) {

    char* str = malloc(sizeof(char) * 2000);
    int tam = 1;

    do {

        lerStr(str);
        int tam = strlen(str);

        if(strcmp(str, "FIM") != 0) {

            //charEspecial(str, tam);
            ciframentoCesar(str, tam);
            printf("%s\n", str);
        }
        

    }while(strcmp(str, "FIM") != 0);

    free(str);

    return 0;
}