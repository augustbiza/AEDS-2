#include <stdio.h>

int ehFim(char* input) {
        int fim = 0;
        if(input[0] == 'F' && input[1] == 'I' && input[2] == 'M' && input[3] == '\0') fim = 1;
        return fim;
}

void removerQuebraLinha(char* str) {
        for(int i = 0; str[i] != '\0'; i++) {
                if(str[i] == '\r' || str[i] == '\n') {
                        str[i] = '\0';
                        break;
                }
        }
}

int tamanhoStr(char* str) {
        int t = 0;
        for(int i = 0; str[i] != '\0'; i++) t++;

        return t;
}

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
                removerQuebraLinha(input);
                int tam = tamanhoStr(input);

                if(!ehFim(input)) {
                        charEspecial(input, tam);
                        if(ehPalindromo(input, tam)) printf("SIM\n");
                        else printf("NAO\n");
                }

        }while(!ehFim(input));

        return 0;
}
