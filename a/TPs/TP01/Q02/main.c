//Palindromo em C
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
//#define tam 1000


void inverter(char *copia, int c) {
    int i = 0, f = c-1, aux;
    while(i <= f) {
        aux = copia[i];
        copia[i] = copia[f];
        copia[f] = aux;
        i++; f--;
    }
}


bool palindromo(char *frase) {
    bool palin = false;
    
    int c = strlen(frase);

    char copia[c];
    strcpy(copia, frase);
    inverter(copia, c);

    if(strcmp(frase, copia)) {
        palin = false;
    } else {
        palin = true;
    }

    return palin;
}


int main(void) {

    char texto[1000];
    do{
        scanf(" %[^\n]", texto);
        if(strcmp(texto, "FIM") != 0) {
            if(palindromo(texto)) printf("SIM\n");
            else printf("NAO\n");
        }
        

    }while(strcmp(texto, "FIM") != 0);
    


    return 0;
}