//Palindromo iterativo em C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

char* lerPalavra(void) {

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

bool verificaPalindromo(char* palavra, int tam) {

    bool palindromo = true;
    int i = 0;

    while(tam != i && palindromo) {

        if(palavra[i] != palavra[tam]) palindromo = false;

        i++; tam--;
    }

    return palindromo;
}

bool comparaFIM(char* palavra) {

    bool igual = false;

    if(palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M' && palavra[3] == '\0') igual = true;

    return igual;
}

int main(void) {

    char* palavra;

    do {

        palavra = lerPalavra();

        if(!comparaFIM(palavra)) {

            int tam = tamanhoPalavra(palavra);

            if(verificaPalindromo(palavra, tam-1)) printf("SIM\n");
            else printf("NAO\n");
        }

    }while(!comparaFIM(palavra));
    
    return 0;
}