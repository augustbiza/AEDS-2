//Busca Binária em C (iterativa)
//char[][tam]
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool buscaBinaria(char lista[][15], char* chave, int tam) {

    bool achou = false;

    int esq = 0, meio, dir = tam-1;


    while(esq <= dir && !achou) {
    
        meio = (esq + dir) / 2;

        if(strcmp(lista[meio], chave) == 0) achou = true;
        else if(chave < lista[meio]) {
            dir = meio-1;
        }
        else if(chave > lista[meio]) {
            esq = meio+1;
        }
    }

    return achou;
}

int main(void) {

    char lista[][15] = {{"Ana"}, {"Joao"}, {"Maria"}, {"Pedro"}};
    int tam = 4;
    char chave[] = "Pedro";

    if(buscaBinaria(lista, chave, tam)) printf("Chave encontrada\n");
    else printf("Chave não encontrada\n");

    return 0;
}