//Pesquisa Sequencial em C (recurssiva)
//buscando do último para o primeiro
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool buscaSequencial(int *arr, int chave, int tam) {
    bool chaveEncontrada = false;

    if(arr[tam] == chave) chaveEncontrada = true;
    else if(tam > 0){
        
        chaveEncontrada = buscaSequencial(arr, chave, tam-1);
    }

    return chaveEncontrada;
}

int main(void) {

    int arr[] = {1,2,3,4,5};
    int tam = 5;
    int chave = 5;

    if(buscaSequencial(arr, chave, tam-1)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}