#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Struct Array
typedef struct Array {
int array[10];
int n;
} Array;

void lerArray(Array* vet) {
        printf("Insira %d os elementos: ", vet->n);
        for(int i = 0; i < vet->n; i++) scanf("%d", &vet->array[i]);
}

void mostrarArray(Array* vet) {
        for(int i = 0; i < vet->n; i++) {
                printf("%d ", vet->array[i]);
        }
        printf("\n");
}

void swap(Array* vet, int i, int j) {
        int aux = vet->array[i];
        vet->array[i] = vet->array[j];
        vet->array[j] = aux;
}
//---
//ORDENAÇÃO
void selecao(Array* vet) {
        for(int i = 0; i < vet->n-1; i++) {
                int menorIndex = i;
                for(int j = i+1; j < vet->n; j++) {
                        if(vet->array[j] < vet->array[menorIndex]) menorIndex = j;
                }
                swap(vet, i, menorIndex);
        }
}
//---

int main(void) {

        Array* vet = malloc(sizeof(Array));
        printf("Tamanho do vetor: "); scanf("%d", &vet->n);
        lerArray(vet);
        mostrarArray(vet);

        selecao(vet);
        mostrarArray(vet);

        free(vet);
}