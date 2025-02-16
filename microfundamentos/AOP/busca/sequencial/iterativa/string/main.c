//Pesquisa Sequencial em C (iterartivo)
//char[][tam]
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool buscaSequencial(char lista[][15], char* chave, int tam) {
    bool chaveEncontrada = false;
    int i = 0;

    while(!chaveEncontrada && i <= tam) {
        if(strcmp(lista[tam], chave) == 0) chaveEncontrada = true;

        i++;
    }

    return chaveEncontrada;
}

int main(void) {

    char lista[][15] = {{"Ana"}, {"Joao"}, {"Maria"}, {"Pedro"}};
    int tam = 4;
    char chave[] = "Pedro";

    if(buscaSequencial(lista, chave, tam-1)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}