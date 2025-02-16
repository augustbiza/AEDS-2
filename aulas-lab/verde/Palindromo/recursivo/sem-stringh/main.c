//Palíndromo em C (recursivo)
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* lerPalavra (void) {
    
    char* palavra = malloc(sizeof(char) * 100);
    scanf(" %[^\n]", palavra);

    return palavra;
}

bool comparaFIM(char* palavra) {        //strcmp feito manualmente para a palavra FIM

    bool igual = false;

    if(palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M' && palavra[3] == '\0') igual = true;

    return igual;
}

int tamanhoPalavra(char* palavra) {     //strlen feito manualmente
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

        if(!comparaFIM(palavra)) {

            palavra = lerPalavra();

            int tam = tamanhoPalavra(palavra);

            if(verificaPalindromo(palavra, 0, tam-1)) printf("SIM\n");
            else printf("NAO\n");
        }
    
    }while(!comparaFIM(palavra));

    return 0;
}