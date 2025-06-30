//Ciframento de César em C (iterativo)
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

void lerStr(char* str) {

    scanf(" %[^\n]", str);

}

void ciframentoCesar(char* str, int tam) {

    if(tam > 0) {
        if(str[tam-1] >= 32 && str[tam-1] <= 127) str[tam-1] += 3;

        ciframentoCesar(str, tam-1);
    }
}


int main(void) {

    char* str = malloc(sizeof(char) * 2000);
    int tam = 1;

    do {

        lerStr(str);
        int tam = strlen(str);

        if(strcmp(str, "FIM") != 0) {

            ciframentoCesar(str, tam);
            printf("%s\n", str);
        }

    }while(strcmp(str, "FIM") != 0);

    free(str);

    return 0;
}