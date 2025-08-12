#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main(void) {

    char str[1000];
    
    while(scanf(" %[^\n]", str) != EOF) {       //scanf(" %[^\n]", str) == 1
        
        int c = 0;
        int n = strlen(str);
        bool erro = false;

        for(int i = 0; i < n; i++) {

            if(str[i] == '(') c++;
            if(str[i] == ')') c--;

            if(c < 0) {

                erro = true;
                i = n;
            }
        }

        if(erro) printf("incorrect\n");
        else {
            if(c > 0) printf("incorrect\n");
            else printf("correct\n");
        }
    }

    return 0;
}