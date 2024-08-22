/*COMBINADOR
AoQeaeAADeNtaehchec DguMksuuosoMkNeN        ADogQueMakesAuAuDoesNotMakeNhecNhec
CouLdaaMrde aQearNoo                        CaoQueLadraNaoMorde
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void combinador(char *a, char *b) {
    int tamA = strlen(a), tamB = strlen(b), par = 0, imp = 0;
    char *c = (char*)malloc(sizeof(char) * 255);

    int menor = tamA;
        if(tamB < menor) menor = tamB;


    //mesmo tamanho
    if(tamA == tamB) {
        for(int i = 0; i < tamA + tamB; i++) {
            if(i % 2) {
                c[i] = b[imp];
                imp++;
            }
            else {
                c[i] = a[par];
                par++;
            }
        }
    }

    //tamanhos diferentes
    else {

        for(int i = 0; i < 2*menor; i++) {
            if(i % 2) {
                c[i] = b[imp];
                imp++;
            }
            else {
                c[i] = a[par];
                par++;
            }
        }
        //A > B
        if(tamA > tamB) {
            for(int i = par; i < tamA + tamB + 1; i++) {
                c[par+imp] = a[par];
                par++;
            }

            //c[tamA + tamB + 1] = '\0';
        }

        //B > A
        else {

        for(int i = imp; i < tamA + tamB + 1; i++) {
            c[par+imp] = b[imp];
            imp++;
        }

        }


        //printf
        for(int i = 0; i < tamA + tamB; i++) {
            printf("%c", c[i]);
        }
        printf("\n");
    }

    free(c);
}


int main(void) {

    char *a = (char*)malloc(sizeof(char) * 255);
    char *b = (char*)malloc(sizeof(char) * 255);

    while(scanf("%s %s", a, b) !=  EOF) {
        combinador(a,b);
    }

    free(a);
    free(b);

    return 0;
}