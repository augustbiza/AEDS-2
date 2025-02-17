//Palíndromo em C (recursivo)
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

char* lerPalavra (void) {
    
    char* palavra = malloc(sizeof(char) * 2000);
    scanf(" %[^\n]", palavra);

    return palavra;
}

int tamanhoPalavra(char* palavra) {
    int tam = 0;

    while(palavra[tam] != '\0') {

        tam++;
    }

    return tam;
}

bool verificaPalindromo(char* palavra, int inicio, int final) {

    bool palindromo = false;

    if(inicio == final) palindromo = true;
    else {

        if(palavra[inicio] == palavra[final-1]) palindromo = verificaPalindromo(palavra, inicio+1, final-1);
    }

    return palindromo;
}


int main(void) {

    char* palavra = malloc(sizeof(char) * 2000);

    do {

        if(strcmp(palavra, "FIM") != 0) {

            palavra = lerPalavra();

            int tam = tamanhoPalavra(palavra);

            if(verificaPalindromo(palavra, 0, tam)) printf("SIM\n");
            else printf("NAO\n");
        }
    
    }while(strcmp(palavra, "FIM") != 0);

    free(palavra);

    return 0;
}