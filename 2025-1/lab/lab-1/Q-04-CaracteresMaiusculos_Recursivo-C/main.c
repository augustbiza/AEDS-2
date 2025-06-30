//Caracteres Maiúsculos em C (recursivo)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int carateresMaiusculos(char* str, int tam) {

    int qt = 0;

    if(tam > 0) {

        if(str[tam-1] >= 65 && str[tam-1] <= 90) qt = 1 + carateresMaiusculos(str, tam-1);
        else qt = 0 + carateresMaiusculos(str, tam-1);
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