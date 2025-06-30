// Soma de Dígitos em C (recursivo)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int somaDigitos(char* num, int tam) {

    int soma = 0;

        if(tam > 0) {

            switch(num[tam-1]) {
                case '1':
                    soma += 1 + somaDigitos(num, tam-1); break;
                case '2':
                    soma += 2 + somaDigitos(num, tam-1); break;
                case '3':
                    soma += 3 + somaDigitos(num, tam-1); break;
                case '4':
                    soma += 4 + somaDigitos(num, tam-1); break;
                case '5':
                    soma += 5 + somaDigitos(num, tam-1); break;
                case '6':
                    soma += 6 + somaDigitos(num, tam-1); break;
                case '7':
                    soma += 7 + somaDigitos(num, tam-1); break;
                case '8':
                    soma += 8 + somaDigitos(num, tam-1); break;
                case '9':
                    soma += 9 + somaDigitos(num, tam-1); break;
                default:
                    soma += 0 + somaDigitos(num, tam-1);
            }
        }

    return soma;
}


int main(void) {

    char* str = malloc(sizeof(char) * 1000);

    do{

        scanf(" %[^\n]", str);
        int tam = strlen(str);

        if(strcmp(str, "FIM") != 0) {

            printf("%d\n", somaDigitos(str, tam));
        }

    }while(strcmp(str, "FIM") != 0);


    free(str);

    return 0;
}