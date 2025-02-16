//Busca Binária em C (recursiva)
//char[][]
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool buscaBinaria(char lista[][15], char *chave, int esq, int dir) {

    bool achou = false;

    int meio = (esq + dir) / 2;

    if(strcmp(lista[meio], chave) == 0) achou = true;

    else if(esq <= dir) {

        if(chave < lista[meio]) {
            achou = buscaBinaria(lista, chave, esq, meio-1);
        }
        else if(chave > lista[meio]) {
            achou = buscaBinaria(lista, chave, meio+1, dir);
        }
    }

    return achou;
}


int main(void) {

    char lista[][15] = {{"Ana"}, {"Joao"}, {"Maria"}, {"Pedro"}};
    int tam = 4;
    char chave[] = "Pedroo";
    int esq = 0, dir = tam - 1;

    if(buscaBinaria(lista, chave, esq, dir)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}