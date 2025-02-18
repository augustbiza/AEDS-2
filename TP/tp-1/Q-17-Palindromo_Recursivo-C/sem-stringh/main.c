//Palindromo recursivo C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void lerPalavra(char* str) {

    scanf(" %[^\n\r]", str);
}

bool verificaPalindromo(char* palavra, int i, int f) {

    bool palindromo = true;

    if(palavra[i] != palavra[f-i-1]) palindromo = false;

    else if(i < f) {

        palindromo = verificaPalindromo(palavra, i+1, f);
    }

    return palindromo;
}

bool comparaFIM(char* palavra) {

    bool igual = false;

    if(palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M' && palavra[3] == '\0') igual = true;

    return igual;
}

int tamanhoPalavra(char* palavra) {
    int tam = 0;

    while(palavra[tam] != '\0') {

        tam++;
    }

    return tam;
}


int main(void) {

    char* palavra = malloc(sizeof(char) * 2000);    //como a entrada de dados é muito grande usei o valor 2000 char para alocar

    do {
        
        lerPalavra(palavra);

        if(!comparaFIM(palavra)) {

            int tam = tamanhoPalavra(palavra);

            if(verificaPalindromo(palavra, 0, tam)) printf("SIM\n");
            else printf("NAO\n");
        
        }

    }while(!comparaFIM(palavra));     
    
    free(palavra);      //liberar a alocação
    
    return 0;
}