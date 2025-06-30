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
        printf("Heap vazia\n\n"); return;
    }

    printf("Heap tam: %d -> ", h->tam);
    for(int i = 0; i < h->tam; i++) printf("%d ", h->array[i]); printf("\n");
}

void ajustarHeapMax(Heap* h) {

    int indexFi = h->tam-1;
    int indexPai = (indexFi-1)/2;

    while(indexFi > 0) {

        if(h->array[indexFi] > h->array[indexPai]) {
            int aux = h->array[indexFi]; h->array[indexFi] = h->array[indexPai]; h->array[indexPai] = aux;
        }

        indexFi = indexPai;
        indexPai = (indexFi-1)/2;

    }
    
}

void ajustarHeapMin(Heap* h) {

    int indexFi = h->tam-1;
    int indexPai = (indexFi-1)/2;

    while(indexFi > 0) {

        if(h->array[indexFi] < h->array[indexPai]) {
            int aux = h->array[indexFi]; h->array[indexFi] = h->array[indexPai]; h->array[indexPai] = aux;
        }

        indexFi = indexPai;
        indexPai = (indexFi-1)/2;

    }
}

void inserirHeap(Heap* h, int elem) {
    
    if(h->tam >= TAM) {
        printf("Heap cheia\n"); return;
    }
    
    h->array[h->tam++] = elem;

    mostrarHeap(h);
    ajustarHeapMax(h);
    //ajustarHeapMin(h);
    mostrarHeap(h);
}

void inserirCresHeap(Heap* h) {

    if(h->tam >= TAM) {
        printf("Heap cheia\n"); return;
    }

    for(int i = 0; h->tam < TAM; i++) {
        h->array[h->tam++] = i;
    }

    mostrarHeap(h);
    ajustarHeapMax(h);
    //ajustarHeapMin(h);
    mostrarHeap(h);
}

void inserirDecresHeap(Heap* h) {

    if(h->tam >= TAM) {
        printf("Heap cheia\n"); return;
    }

    for(int i = TAM; h->tam < TAM; i--) {
        h->array[h->tam++] = i;
    }

    mostrarHeap(h);
    //ajustarHeapMax(h);
    ajustarHeapMin(h);
    mostrarHeap(h);
}


int main(void) {
    
    Heap* minhaheap = criarHeap();
    
    mostrarHeap(minhaheap);

    //inserirCresHeap(minhaheap);
    inserirDecresHeap(minhaheap);

    mostrarHeap(minhaheap);

    
    return 0;
}