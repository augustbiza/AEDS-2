//Palindromo iterativo em C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

char* lerPalavra(void) {

    char* palavra = malloc(100 * sizeof(char));
    scanf(" %[^\n]", palavra);

    return palavra;
}

int tamanhoPalavra(char* palavra) {
    
    int tam = 0;
    int i = 0;

    while(palavra[i] != '\0') {

        if(palavra[i] != '\0') tam++;

        i++;
    }

    return tam;
}

bool verificaPalindromo(char* palavra, int tam) {

    bool palindromo = true;
    int i = 0;

    while(tam != i && palindromo) {

        if(palavra[i] != palavra[tam]) palindromo = false;

        i++; tam--;
    }

    return palindromo;
}

int main(void) {

    char* palavra;

    do {

        palavra = lerPalavra();

        if(strcmp(palavra, "FIM") != 0) {

            int tam = tamanhoPalavra(palavra);

            if(verificaPalindromo(palavra, tam-1)) printf("SIM\n");
            else printf("NAO\n");
        }

    }while(strcmp(palavra, "FIM") != 0);
    
    return 0;
}