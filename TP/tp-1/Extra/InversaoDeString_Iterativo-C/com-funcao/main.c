// Inversão de Strings em C (iterativo)
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

void inversaoString(char* str, int tam) {

    char aux;

    for(int i = 0; i < tam/2; i++) {

        if((str[i] >= 32 && str[i] <= 127) ) {
            
            if(str[i] != str[tam-i-1]) {
                aux = str[i];
                str[i] = str[tam-i-1];
                str[tam-i-1] = aux;
            }
        }
    }
} 



int main(void) {

    char* str = malloc(sizeof(char) * 2000);

    do{

        scanf(" %[^\n]", str);
        
        int tam = strlen(str);

        if(strcmp(str, "FIM") != 0) {

            inversaoString(str, tam);
            
            printf("%s\n", str);
        }

        
    }while(strcmp(str, "FIM") != 0);


    free(str);

    return 0;
}