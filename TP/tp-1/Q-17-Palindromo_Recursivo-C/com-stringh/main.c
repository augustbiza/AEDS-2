//Palindromo recursivo C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

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


int main(void) {

    char* palavra = malloc(sizeof(char) * 2000);    //como a entrada de dados é muito grande usei o valor 2000 char para alocar

    do {
        
        lerPalavra(palavra);

        if(strcmp(palavra, "FIM") != 0) {

            int tam = strlen(palavra);

            if(verificaPalindromo(palavra, 0, tam)) printf("SIM\n");
            else printf("NAO\n");
        
        }

    }while(strcmp(palavra, "FIM") != 0);     
    
    free(palavra);      //liberar a alocação
    
    return 0;
}