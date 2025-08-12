// Inversão de Strings em C (iterativo)
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool comparaFIM(char* str) {

    bool igual = false;

    if(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\0') igual = true;

    return igual;
}

int tamanhoStr(char* str) {
    int tam = 0;

    while(str[tam] != '\0') {

        tam++;
    }

    return tam;
}

void inversaoString(char* str, int tam) {

    char aux;

    for(int i = 0; i < tam/2; i++) {
        
        if(str[i] != str[tam-i-1]) {
            aux = str[i];
            str[i] = str[tam-i-1];
            str[tam-i-1] = aux;
        }
    }
} 



int main(void) {

    char* str = malloc(sizeof(char) * 2000);

    do{

        scanf(" %[^\n]", str);
        
        int tam = tamanhoStr(str);

        if(!comparaFIM(str)) {

            inversaoString(str, tam);
            
            printf("%s\n", str);
        }

        
    }while(!comparaFIM(str));


    free(str);

    return 0;
}