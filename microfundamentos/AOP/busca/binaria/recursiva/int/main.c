//Busca Binária em C (recursiva)
//Números inteiros
#include <stdio.h>
#include <stdbool.h>
//#include <string.h>

bool buscaBinaria(int* arr, int chave, int esq, int dir) {

    bool achou = false;

    int meio = (esq + dir) / 2;

    if(arr[meio] == chave) achou = true;

    else if(esq <= dir) {

        if(chave < arr[meio]) {
            achou = buscaBinaria(arr, chave, esq, meio-1);
        }
        else if(chave > arr[meio]) {
            achou = buscaBinaria(arr, chave, meio+1, dir);
        }
    }

    return achou;
}


int main(void) {

    int arr[] = {1,2,3,4,5};
    int chave = 6;
    int tam = sizeof(arr) / sizeof(arr[0]);
    int esq = 0, dir = tam - 1;

    if(buscaBinaria(arr, chave, esq, dir)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}