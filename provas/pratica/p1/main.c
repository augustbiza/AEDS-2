#include <stdio.h>
#include <stdbool.h>

int main(void) {

    int rodadas;

    do {

        scanf("%d", &rodadas);

        int mark[rodadas];
        int leti[rodadas];

        if(rodadas != 0) {

            for(int i = 0; i < rodadas; i++) {              //grava a sequência de Mark
                scanf("%d", &mark[i]);
            }
            for(int i = 0; i < rodadas; i++) {              //grava a sequência de Leti
                scanf("%d", &leti[i]);
            }

            int ptsMark = 0, ptsLeti = 0;                   //pontos de Mark e Leti

            int posMark, posLeti;                          //posição do último termo da sequência de 3 para o bonus

            bool bonusMark = false, bonusLeti = false;     //verificar se tem a sequência de 3

            int seq = 1;             //sequência de iguais 


            for(int i = 0; i < rodadas; i++) {              //soma de pontos do mark
                ptsMark += mark[i];
            }

            for(int i = 0; i < rodadas-1; i++) {            //seleção para ver se mark possui uma sequência de 3 iguais
                for(int j = i+1; j < rodadas; j++) {        
                    if(mark[j] != mark[i]) seq = 1;         //se o próximo número for diferente reinicia a sequência
                    else seq++;

                    if(seq == 3) {              //se a sequência de 3 for atingida
                        ptsMark += 30;          //soma 30pts ao mark
                        posMark = j;            //guarda a posição do último número da sequência
                        bonusMark = true;       //guarda que mark possui bonus
                        i = rodadas;            //sai do laço do seleção
                    }
                }
            }


            seq = 1;       //reinicia a sequência para Leti

            for(int i = 0; i < rodadas; i++) {              //soma de pontos do leti
                ptsLeti += leti[i];
            }

            for(int i = 0; i < rodadas-1; i++) {            //seleção para ver se leti possui uma sequência de 3 iguais
                for(int j = i+1; j < rodadas; j++) {        
                    if(leti[j] != leti[i]) seq = 1;         //se o próximo número for diferente reinicia a sequência
                    else seq++;

                    if(seq == 3) {              //se a sequência de 3 for atingida
                        ptsLeti += 30;          //soma 30pts ao Leti
                        posLeti = j;            //guarda a posição do último número da sequência
                        bonusLeti = true;       //guarda que leti possui bonus
                        i = rodadas;            //sai do laço do seleção
                    }
                }
            }


            if(bonusMark && bonusLeti) {      //se mark e leti ganharam bonus é preciso ver quem atingiu a sequência primeiro e tirar o bonus do segundo
        
                if(posMark == posLeti) {      //se ambos tiveram a sequência na MESMA rodada
                    ptsMark -= 30;            //retira pontos de ambos
                    ptsLeti -= 30;
                }
                else if(posMark < posLeti) {    //se a sequencia de mark acabou primeiro
                    ptsLeti -= 30;              //retira os pontos da leti
                }
                else if(posMark > posLeti) {    //se a sequencia de leti acabou primeiro
                    ptsMark -= 30;              //retira os pontos do mark
                }
            }


            if(ptsMark == ptsLeti) printf("T\n");
            else if(ptsMark > ptsLeti) printf("M\n");
            else if(ptsMark < ptsLeti) printf("L\n");
        }

    }while(rodadas != 0);

    return 0;
}