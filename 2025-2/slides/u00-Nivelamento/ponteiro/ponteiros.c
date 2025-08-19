#include <stdio.h>

int main(void) {
    int vet[3];
    vet[0] = 1; vet[1] = 2; vet[2] = 3;
    
    printf("vet = %p\n", vet+0);
    for(int i = 0; i < 3; i++) {
        printf("vet[%d] = %d[%p]\n", i, *(vet+i), vet+i);
    }
    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("vet[%d] = %d[%p]\n", i, vet[i], &vet[i]);
    }
    printf("\n");
    printf("*vet = %d\n&vet = %p\n", *vet, &vet);

    return 0;
}