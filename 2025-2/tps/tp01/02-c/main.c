#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void charEspecial(char* str, int n) {
    for(int i = 0; i < n; i++) {
        if(str[i] < 32 || str[i] > 127) str[i] = '.';
    }
}

int palindromo(char* input, int i, int n) {
    int palin;
    if(i == n-1) palin = 1;
    else if(input[i] == input[n-i-1]) palin = palindromo(input, i+1, n);
    else palin = 0;
    
    return palin;
}

int main(void) {
    char input[2000];

    do{
        fgets(input, 2000, stdin);
        input[strcspn(input,"\n")] = '\0';
        input[strcspn(input,"\r")] = '\0';
        int n = strlen(input);

        if(strcmp(input, "FIM") != 0) {
            charEspecial(input, n);
            if(palindromo(input, 0, n)) printf("SIM\n");
            else printf("NAO\n");
        }

    }while(strcmp(input, "FIM") != 0);

    return 0;
}