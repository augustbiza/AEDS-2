```c
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

    return tam;
}

bool verificaPalindromo(char* palavra, int tam) {

    bool palindromo = true;
    int i = 0;

    while(i < tam/2 && palindromo) {

        if(palavra[i] != palavra[tam-1-i]) palindromo = false;

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

    //char* palavra = malloc(sizeof(char) * 100);
    char palavra[2000];

    do {

        scanf(" %[^\n]", palavra);
        //lerPalavra(palavra);

        if(!comparaFIM(palavra)) {

            int tam = tamanhoPalavra(palavra);

            if(verificaPalindromo(palavra, tam)) printf("SIM\n");
            else printf("NAO\n");
        
        }

    }while(!comparaFIM(palavra));     
    
    //free(palavra);
    
    return 0;
}
```