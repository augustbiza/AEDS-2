//Palindromo Recursivo
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool verificar(char *texto, char *copia, int tam, int z) {
    
    bool palin = true;

    if(tam == 1) {
        palin = true;
    }

    if(z == '\0') {
        
    }

    else {
        if(texto[z] == copia[z]) verificar(texto,copia,tam,z+1);
        else palin = false;
    }

    return palin;
}

void inverter(char *copia, int tam) {
    int i = 0, f = tam - 1, aux;

    while(i <= f) {
        aux = copia[i];
        copia[i] = copia[f];
        copia[f] = aux;

        i++; f--;
    }
}

bool palindromo(char *texto) {
    bool palin = false;

    int c = strlen(texto);

    char copia[1000];
    strcpy(copia, texto);
    inverter(copia, c);

    if(verificar(texto, copia, c-1, 0)) palin = true;

    return palin;
}


int main(void) {

    char texto[1000];
    do{
        scanf(" %[^/n]", texto);

        if(strcmp(texto, "FIM") != 0) {
            if(palindromo(texto)) printf("SIM\n");
            else printf("NAO\n");
        }

    } while(strcmp(texto, "FIM") != 0);

}