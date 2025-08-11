#include <stdio.h>
#include <string.h>

int ehPalindromo(char* str, int n) {
        int palin = 1;

        for(int i = 0; i <= n/2; i++) {
                if(str[i] != str[n-i-1]) {
                        palin = 0;
                        i = n;
                }
        }

        return palin;
}

void charEspecial(char* str, int n) {
        for(int i = 0; i < n; i++) {
                if(str[i] < 32 || str[i] > 127) str[i] = '.';
        }
} 


int main(void) {

        char input[1000];

        do{
                fgets(input,1000,stdin);
                input[strcspn(input,"\n")] = '\0';
                input[strcspn(input,"\r")] = '\0';
                int tam = strlen(input);

                if(strcmp(input, "FIM") != 0) {
                        charEspecial(input, tam);
                        if(ehPalindromo(input, tam)) printf("SIM\n");
                        else printf("NAO\n");
                }

        }while(strcmp(input, "FIM") != 0);

        return 0;
}
