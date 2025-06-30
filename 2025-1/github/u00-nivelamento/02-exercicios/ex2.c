#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool pesquisa(int* arr, int x) {
    bool achou = false;

    int esq = 0, dir = ((sizeof(arr)/sizeof(arr[0])))-1;

    while(esq <= dir && !achou) {

        int meio = (esq+dir)/2;

        if(arr[meio] == x) achou = true;
        else if(arr[meio] < x) esq = meio+1;
        else if(arr[meio] > x) dir = meio-1;
    }

    return achou;
}

int main(void) {

    int arr[] = {1,3,4,7,11,14,18};

    if(pesquisa(arr, 3)) printf("SIM\n");
    else printf("NAO\n");

    return 0;
}