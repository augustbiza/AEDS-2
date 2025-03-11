// Arquivo em C
//OBSERVAÇÃO: O ERRO ESTÁ NA SAÍDA ONDE CADA ENTRADA POSSUI UM NÚMERO DE CASAS DECIMAIS APÓS A VÍRGULA

#include <stdio.h>
#include <stdlib.h>

void escreverFile(int n) {
    FILE* pF = fopen("pubin.bin", "wb");    //b - binário

    if (!pF) {      //erro ao abrir o arquivo
        return;
    }

    double valor;
    
    for (int i = 0; i < n; i++) {
        scanf("%lf", &valor);
        fwrite(&valor, sizeof(double), 1, pF);      //escrever dados binários --> 
    }

    fclose(pF);
}

void lerFileInverso(int n) {
    FILE* pF = fopen("pubin.bin", "rb");    //b - binário

    if (!pF) {      //erro ao abrir o arquivo
        return;
    }

    double valor;

    fseek(pF, 0, SEEK_END);     //SEEK_END - pF aponta pro final do arquivo 
    
    for (int i = 0; i < n; i++) {
        fseek(pF, -(i + 1) * sizeof(double), SEEK_END);     //fseek(arquivo, deslocamento, origem);
                                                            //fseek(pF, - (tamanho * posição), final); - porque está voltando no arquivo
        fread(&valor, sizeof(double), 1, pF);
        printf("%.10g\n", valor);       //%.10g - escreve em notação ciientífica com 10 algarismos significativos no máx e retira os zeros a ireita após a vírgula
    }

    fclose(pF);
}

int main(void) {
    int n;
    scanf("%d", &n);

    escreverFile(n);
    lerFileInverso(n);

    return 0;
}
