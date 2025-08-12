//Busca Binária em C (iterativa)
//int
#include <stdio.h>
#include <stdbool.h>

bool buscaBinaria(int* arr, int chave, int tam) {

    bool achou = false;

    int esq = 0, meio, dir = tam-1;


    while(esq <= dir && !achou) {
    
        meio = (esq + dir) / 2;

        if(arr[meio] == chave) achou = true;
        else if(chave < arr[meio]) {
            dir = meio-1;
        }
        else if(chave > arr[meio]) {
            esq = meio+1;
        }
    }

    return achou;
}

int main(void) {

    int arr[] = {1,2,3,4,5};
    int chave = 6;
    int tam = sizeof(arr) / sizeof(int);

    if(buscaBinaria(arr, chave, tam)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}