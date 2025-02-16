//Palindromo iterativo em C utilizando a biblioteca <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

char* lerPalavra(void) {

    char* palavra = malloc(sizeof(char) * 100);
    scanf(" %[^\n]", palavra);

    return palavra;
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

            int tam = strlen(palavra);

            if(verificaPalindromo(palavra, tam-1)) printf("SIM\n");
            else printf("NAO\n");
        }

    }while(strcmp(palavra, "FIM") != 0);
    
    return 0;
}