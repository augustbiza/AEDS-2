#include <stdio.h>

int main(void) {
    int a[3] = {4, 9, 16};
    int* p = a;
    
    //nome + valor
    printf("Nome + Valor\n");
    for(int i = 0; i < 3; i++) {
        printf("a[%d] = %d\n", i, a[i]);
    }
    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("p[%d] = %d\n", i, p[i]);   
    }
    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("*(a+%d) = %d\n", i, *(p+i));
    }
    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("*(p+%d) = %d\n", i, *(p+i));
    }
    printf("\n");
    
    //nome + endereço
    printf("Nome + Endereco\n");
    for(int i = 0; i < 3; i++) {
        printf("&a[%d] = %p\n", i, &a[i]);
    }
    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("&p[%d] = %p\n", i, &p[i]);
    }
    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("a+%d = %p\n", i, a+i);
    }
    printf("\n");
    for(int i = 0; i < 3; i++) {
        printf("p+%d = %p\n", i, p+i);
    }
    printf("\n");
    
    return 0;
}
