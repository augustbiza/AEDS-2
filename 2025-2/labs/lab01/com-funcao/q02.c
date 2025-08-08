#include <stdio.h>
#include <string.h>

int contarMaiusculas(char* str, int i) {
    int qt = 0;

    if(str[i] == '\0') qt = 0;
    else {
        if(str[i] >= 65 && str[i] <= 90) qt = 1 + contarMaiusculas(str, i+1);
        else qt = 0 + contarMaiusculas(str, i+1);
    }

    return qt;
}

int main(void) {

    char str[100];

    do {

        fgets(str, 100, stdin); 
        str[strcspn(str,"\n")] = '\0';

        if(strcmp(str, "FIM") != 0 && str[0] != '\0') {
			printf("%d\n", contarMaiusculas(str, 0));	
		}

    } while(strcmp(str, "FIM") != 0);

    return 0;
}