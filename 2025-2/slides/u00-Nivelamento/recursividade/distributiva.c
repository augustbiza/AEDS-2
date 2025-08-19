#include <stdio.h>

int distributiva(int x, int k){
    int soma = 0;
    if(k > 0) soma += x + distributiva(x, k-1);
    
    return soma;
}

int main(void) {
    int x,k;
    scanf("%d%d", &x, &k);

    int xk = distributiva(x, k);
    printf("%d * %d = %d\n", x, k, xk);

    return 0;
}