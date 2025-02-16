//
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool buscaSequencial(char lista[][15], char *chave, int tam) {
    bool chaveEncontrada = false;

    if(strcmp(lista[tam], chave) == 0) chaveEncontrada = true;
    else if(tam > 0){
        
        chaveEncontrada = buscaSequencial(lista, chave, tam-1);
    }

    return chaveEncontrada;
}

int main(void) {

    char lista[][15] = {{"Ana"}, {"Joao"}, {"Maria"}, {"Pedro"}};
    int tam = 4;
    char chave[] = "jao";

    if(buscaSequencial(lista, chave, tam-1)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}