#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 9

typedef struct {
    int array[TAM];
    int tam;
} Heap;

Heap* criarHeap() {
    Heap* h = (Heap*)malloc(sizeof(Heap));
    h->tam = 0;
    
    return h;
}

void mostrarHeap(Heap* h) {
    if(h->tam == 0) {
        printf("Heap vazia\n"); return;
    }

    printf("Heap tam: %d\n", h->tam);
    for(int i = 0; i < h->tam; i++) printf("%d ", h->array[i]); printf("\n");
}

void inserirHeap(Heap* h, int elem) {
    
    if(h->tam >= TAM) {
        printf("Heap cheia\n"); return;
    }
    
    h->array[h->tam++] = elem;
}


int main(void) {
    
    Heap* minhaheap = criarHeap();
    
    mostrarHeap(minhaheap);
    
    inserirHeap(minhaheap, 5);
    inserirHeap(minhaheap, 2);
    inserirHeap(minhaheap, 7);
    mostrarHeap(minhaheap);
    
    return 0;
}