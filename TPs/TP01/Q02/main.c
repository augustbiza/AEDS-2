//Palindromo em C
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#define tam 50


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

    char texto[tam];
    scanf(" %[^\n\r]", texto);

    if(palindromo(texto)) printf("SIM");
    else printf("NAO");

    return 0;
}