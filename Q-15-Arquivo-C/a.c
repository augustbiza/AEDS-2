// Arquivo em C
/*
SEEK_SET - inicio
SEEK_CUR - atual
SEEK_END - final
*/
#include <stdio.h>
#include <stdlib.h>

void escreverFile(int n) {

    FILE* pF = fopen("pubin.txt", "w");
    
    double valor;
    
    for(int i = n; i > 0; i--) {
        scanf("%lf", &valor);
    
        fprintf(pF, "%lf\n", valor);
    }
    
    fclose(pF);
}

void lerFileInverso(int n) {

    FILE* pF = fopen("pubin.txt", "r");

    double valor;

    fseek(pF, 0, SEEK_END);     //move ponteiro para o final do arquivo

    long posicao;

    posicao = ftell(pF);        //guarda a posição final(atual) do arquivo

    while(posicao > 0) {


    }

    fclose(pF);
}


int main(void) {

    int n;
    scanf("%d", &n);

    escreverFile(n);

    return 0;
}