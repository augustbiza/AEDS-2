#include <stdio.h>
#include <stdlib.h>

void extremos(int* arr, int n) {

    int menor = arr[0], maior = arr[0];

    for(int i = 1; i < n; i++) {
        if(arr[i] < menor) menor = arr[i];
        if(arr[i] > maior) maior = arr[i];
    }

    printf("Menor: %d\nMaior: %d\n", menor, maior);
}

int main(void) {

    int arr[] = {5,1,2,9,7,6};
    int n = sizeof(arr) / sizeof(arr[0]);

    extremos(arr, n);

    return 0;
}