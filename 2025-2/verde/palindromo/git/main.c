//Palindromo iterativo em C
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void lerPalavra(char* str) {

    scanf(" %[^\n\r]", str);
}

int tamanhoPalavra(char* palavra) {     //strlen feito manualmente
    int tam = 0;

    while(palavra[tam] != '\0') {
        tam++;
    }

    return tam;                         //devolve o número exato de caracteres usados (Ana: 3 / Azul: 4)
}

void charEspeciais(char* palavra,int tam) {
    for(int i = 0; i < tam; i++) {
        if(palavra[i] < 32 || palavra[i] > 127) palavra[i] = '.';   //troca o char da utf-8 para um char da ascii
    }
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

bool comparaFIM(char* palavra) {        //strcmp feito manualmente para a palavra FIM

    bool igual = false;

    if(palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M' && palavra[3] == '\0') igual = true;

    return igual;
}

int main(void) {

    char* palavra = malloc(sizeof(char) * 2000);    //como a entrada de dados é muito grande usei o valor 2000 char para alocar

    do {
        
        lerPalavra(palavra);

        if(!comparaFIM(palavra)) {

            int tam = tamanhoPalavra(palavra);

            charEspeciais(palavra, tam);

            if(verificaPalindromo(palavra, tam)) printf("SIM\n");
            else printf("NAO\n");
        
        }

    }while(!comparaFIM(palavra));     
    
    free(palavra);      //liberar a alocação
    
    return 0;
}