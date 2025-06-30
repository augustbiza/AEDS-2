//Inversão de Strings em C (recursivo)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void inverteString(char* str, int i, int f){
    
    int aux;
    
    if(i < f/2) {
        aux = str[i];
        str[i] = str[f-i-1];
        str[f-i-1] = aux;
        
        inverteString(str, i+1, f);
    }
}


int main(void) {
    
    char* str = malloc(sizeof(char) * 1000);
    
    do{
        
        scanf(" %[^\n]", str);
        
        if(strcmp(str, "FIM") != 0) {
            
            int tam = strlen(str);
            
            inverteString(str, 0, tam);
            
            printf("%s\n", str);
        }
        
    }while(strcmp(str, "FIM") != 0);
    
    
    free(str);

    return 0;
}
