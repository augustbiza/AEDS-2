#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int letraMaiuscula(char *texto, int tam) {
    int qt = 0;


    if(texto[tam] != '\0') {
        if(texto[tam] >= 65 && texto[tam] <= 90) qt += 1 + letraMaiuscula(texto, tam-1);
        else qt += 0 + letraMaiuscula(texto, tam-1);
    }

    return qt;
}

int tamTexto(char *texto) {
    int n = strlen(texto);
    int qtMaiuscula = letraMaiuscula(texto, n-1);

    return qtMaiuscula;
}


int main(void) {

    char texto[1000];

    tamTexto(texto);

    do{
        scanf(" %[^\n]", texto);
        if(strcmp(texto, "FIM") != 0) {
            printf("%d\n", tamTexto(texto));
        }

    }while(strcmp(texto, "FIM") != 0);


    return 0;
}