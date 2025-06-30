//strlen
int tamanhoStr(char* str) {
    int tam = 0;

    while(str[tam] != '\0') {

        tam++;
    }

    return tam;
}