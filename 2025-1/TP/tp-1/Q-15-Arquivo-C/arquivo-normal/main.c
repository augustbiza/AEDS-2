#include <stdio.h>

void escreverFile(int n) {

    FILE* pF = fopen("dados.txt", "w");

    if (!pF) {      //erro ao abrir o arquivo

        return;
    }

    double valor;
    for (int i = 0; i < n; i++) {

        scanf("%lf", &valor);
        fprintf(pF, "%.10g\n", valor);
    }

    fclose(pF);
}

void lerFileInverso(int n) {

    FILE* pF = fopen("dados.txt", "r");

    if (!pF) {      //erro ao abrir o arquivo

        return;
    }

    double valor;
    long pos;
    
    fseek(pF, 0, SEEK_END);     //SEEK_END - pF aponta pro final do arquivo
    pos = ftell(pF);            //pega a posição final
    
    for (int i = 0; i < n; i++) {       //percorre os n números do arquivo

        fseek(pF, 0, SEEK_SET);

        for (int j = 0; j < n - i; j++) {   // j < n-i  seleciona os números do final pro início
                                             
            fscanf(pF, "%lf", &valor);
        }

        printf("%.10g\n", valor);   //%.10g - escreve em notação ciientífica com 10 algarismos significativos no máx e retira os zeros a ireita após a vírgula
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
