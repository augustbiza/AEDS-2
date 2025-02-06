//Pesquisa Sequencial em C (iterativo)
//buscando do primeiro para o último
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define TAM 5

bool buscaSequencial(int *arr, int chave) {
    bool chaveEncontrada = false;
    int i = 0;

    while(!chaveEncontrada && i <= TAM) {
        if(arr[i] == chave) chaveEncontrada = true;

        i++;
    }

    return chaveEncontrada;
}

int main(void) {

    int arr[TAM] = {1,2,3,4,5};
    int chave = 6;

    if(buscaSequencial(arr, chave)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}