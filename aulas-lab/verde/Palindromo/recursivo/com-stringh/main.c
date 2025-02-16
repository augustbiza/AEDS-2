//Palíndromo em C (recursivo)
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

char* lerPalavra (void) {
    
    char* palavra = malloc(sizeof(char) * 100);
    scanf(" %[^\n]", palavra);

    return palavra;
}

int tamanhoPalavra(char* palavra) {
    int tam = 0, i = 0;

    while(palavra[i] != '\0') {

        tam++; i++;
    }

    return tam;
}

bool verificaPalindromo(char* palavra, int inicio, int final) {

    bool palindromo = false;

    if(inicio == final) palindromo = true;
    else {

        if(palavra[inicio] == palavra[final]) palindromo = verificaPalindromo(palavra, inicio+1, final-1);
    }

    return palindromo;
}


int main(void) {

    char* palavra;

    do {

        if(strcmp(palavra, "FIM") != 0) {

            palavra = lerPalavra();

            int tam = tamanhoPalavra(palavra);

            if(verificaPalindromo(palavra, 0, tam-1)) printf("SIM\n");
            else printf("NAO\n");
        }
    
    }while(strcmp(palavra, "FIM") != 0);

    return 0;
}