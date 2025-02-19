//Ciframento de César em C (iterativo)
#include <stdio.h>
#include <stdlib.h>

void lerStr(char* str) {

    scanf(" %[^\n]", str);

}

int tamanhoStr(char* str) {
    int tam = 0;

    while(str[tam] != '\0') {

        tam++;
    }

    return tam;
}

bool comparaFIM(char* str, int tam) {

    bool igual = false;

    if(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\0') igual = true;

    return igual;
}
/*
void charEspecial(char* str, int tam) {
    for(int i = 0; i < tam; i++) {
        if(str[i] < 32 || str[i > 127]) str[i] = '';
    }
}
*/
void ciframentoCesar(char* str, int tam) {
    for(int i = 0; i < tam; i++) {
        str[i] += 3;
    }
}


int main(void) {

    char* str = malloc(sizeof(char) * 2000);
    int tam = 1;

    do {

        lerStr(str);
        int tam = tamanhoStr(str);

        if(!comparaFIM(str, tam)) {

            //charEspecial(str, tam);
            ciframentoCesar(str, tam);
            printf("%s\n", str);
        }
        

    }while(!comparaFIM(str, tam));

    free(str);

    return 0;
}