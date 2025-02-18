//strlen
int tamanhoPalavra(char* palavra) {
    int tam = 0;

    while(palavra[tam] != '\0') {

        tam++;
    }

    return tam;
}