//Palindromo iterativo em C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

void lerPalavra(char* str) {

    scanf(" %[^\n\r]", str);
}

bool verificaPalindromo(char* palavra, int tam) {

    bool palindromo = true;
    int i = 0;

    while(i < tam/2 && palindromo) {

        if(palavra[i] != palavra[tam-1-i]) palindromo = false;      //tam-1 = ultimo caractere da string
                                                                    //tam-i = a mesma distancia que i está do início(0) tam estará do final(tam-1)
        i++;            
    }

    return palindromo;
}


int main(void) {

    char* palavra = malloc(sizeof(char) * 2000);    //como a entrada de dados é muito grande usei o valor 2000 char para alocar

    do {
        
        lerPalavra(palavra);

        if(strcmp(palavra, "FIM") != 0) {

            int tam = strlen(palavra);

            if(verificaPalindromo(palavra, tam)) printf("SIM\n");
            else printf("NAO\n");
        
        }

    }while(strcmp(palavra, "FIM") != 0);     
    
    free(palavra);      //liberar a alocação
    
    return 0;
}