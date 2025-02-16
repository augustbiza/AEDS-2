//Pesquisa Sequencial em C (iterativo)
//int
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool buscaSequencial(int *arr, int chave, int tam) {
    bool chaveEncontrada = false;
    int i = 0;

    while(!chaveEncontrada && i <= tam) {
        if(arr[i] == chave) chaveEncontrada = true;

        i++;
    }

    return chaveEncontrada;
}

int main(void) {

    int arr[] = {1,2,3,4,5};
    int tam = sizeof(arr)/sizeof(arr[0]);
    int chave = 6;

    if(buscaSequencial(arr, chave, tam)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}