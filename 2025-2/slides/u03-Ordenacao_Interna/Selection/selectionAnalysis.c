#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Struct Array
typedef struct Array {
int array[10];
int n;
} Array;

void readArray(Array* vet) {
        printf("Insira %d os elementos: ", vet->n);
        for(int i = 0; i < vet->n; i++) scanf("%d", &vet->array[i]);
}

void showArray(Array* vet) {
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
//SELECTION
void selection(Array* vet, int* comp, int* mov) {
        for(int i = 0; i < vet->n-1; i++) {
                int menorIndex = i;
                for(int j = i+1; j < vet->n; j++) {
                        (*comp)++;
                        if(vet->array[j] < vet->array[menorIndex]) menorIndex = j;
                }
                swap(vet, i, menorIndex);
                (*mov) +=3;
        }
}

void showAnalysis(int comp, int mov) {
    printf("Comparacoes : %d\nMovimentacoes: %d\n", comp, mov);
}
//---

int main(void) {

        Array* vet = malloc(sizeof(Array));
        printf("Tamanho do vetor: "); scanf("%d", &vet->n);
        readArray(vet);
        showArray(vet);

        int comp = 0, mov = 0;

        selection(vet, &comp, &mov);
        showArray(vet);
        showAnalysis(comp, mov);

        free(vet);

        return 0;
}