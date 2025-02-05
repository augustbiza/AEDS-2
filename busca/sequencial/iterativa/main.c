// Pesquisa Sequencial
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main()
{
    int key = 100;
    
    int lenth = 5;
    int arr[lenth];
    
    
    for(int i = 0; i < lenth; i++) {
        
        scanf("%d", &arr[i]);
    }

    bool find = false;
    
    int i = 0;
    
    for(int i = 0; i < lenth && !find; i++) {

        if(arr[i] == key) find = true;
    }
    
    if(find) printf("Chave encontrada\n");
    else printf("Chave nao encontrada\n");

    return 0;
}
