#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool pesquisa(int* arr, int n, int x) {

    bool achou = false;

    for(int i = 0; i < n; i++) {
        if(arr[i] == x) {
            achou = true;
            i = n;
        }
    }

    return achou;
}

int main(void) {

    int arr[] = {5,1,2,9,7,6};
    int n = sizeof(arr) / sizeof(arr[0]);

    if(pesquisa(arr, n, 10)) printf("SIM\n");
    else printf("NAO\n");

    return 0;
}