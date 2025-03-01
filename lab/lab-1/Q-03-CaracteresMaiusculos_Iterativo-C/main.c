//Caracteres Maiúsculos em C (iterativo)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int carateresMaiusculos(char* str, int tam) {

    int qt = 0;

    for(int i = 0; i < tam; i++) {
        if(str[i] >= 65 && str[i] <= 90) qt++;
    }

    return qt;
}

int main(void) {

    char* str = malloc(sizeof(char) * 100);

    
    do{
        
        scanf(" %[^\n]", str);
        int tam = strlen(str);

        if(strcmp(str, "FIM") != 0) {
            printf("%d\n", carateresMaiusculos(str, tam));
        }

    }while(strcmp(str, "FIM") != 0);

    free(str);

    return 0;
}