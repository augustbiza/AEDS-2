#include <stdio.h>

int fatorialRec(int n) {
    int fat;
    if(n == 1) fat = n;             //condição de parada
    else fat = n * fatorialRec(n-1);

    return fat;
}

int fatorial(int n) {
    int fat = 1;
    for(int i = n; i > 1; i--) fat *= i;
}

int main(void){
    
    int n = 5;
    int fat = fatorial(n);
    //int fat = fatorialRec(n);
    printf("%d! = %d\n", n, fat);

    return 0;
}