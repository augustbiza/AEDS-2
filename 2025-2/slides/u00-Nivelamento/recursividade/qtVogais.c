#include <stdio.h>
#include <ctype.h>
#include <string.h>

int qtVogais(char* input, int i, int n) {
    int qt = 0;
    if(i < n) {
        char let = tolower(input[i]);
        if(let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u') qt += 1 + qtVogais(input, i+1, n);
        else qt += 0 + qtVogais(input, i+1, n);
    }

    return qt;
}

int main(void) {
    char input[50];
    fgets(input, 50, stdin);
    input[strcspn(input,"\n")] = '\0';

    int qt = qtVogais(input, 0, strlen(input));
    printf("%s = %d vogais\n", input, qt);

    return 0;
}