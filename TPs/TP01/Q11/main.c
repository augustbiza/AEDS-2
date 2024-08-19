#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool palindromo(char *texto, int tam) {
    bool palin = false;
    int c = 0;
    int i = 0, f = tam;
    if(tam == 0) {
        c++;
    }
    else {
        if(texto[f] != texto[i]);
        else c++;
        palindromo(texto, tam-1);
    }
    
    if(c > 0) palin = true;
    return palin;
}



int main(void) {

    char texto[1000];

    do{
        scanf(" %[^\n]", texto);
        if(strcmp(texto, "FIM") != 0) {
            int n = strlen(texto)-1;
            int x = palindromo(texto, n);
            if(x) printf("SIM\n");
            else printf("NAO\n");
        }
    }while(strcmp(texto, "FIM") != 0);


    return 0;
}