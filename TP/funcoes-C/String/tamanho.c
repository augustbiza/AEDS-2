//strlen
int tamanhoPalavra(char* palavra) {
    
    int tam = 0;
    int i = 0;

    while(palavra[i] != '\0') {

        if(palavra[i] != '\0') tam++;

        i++;
    }

    return tam;
}