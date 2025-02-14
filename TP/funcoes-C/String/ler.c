//ler string
char* lerPalavra(void) {

    char* palavra = malloc(100 * sizeof(char));
    scanf(" %[^\n]", palavra);

    return palavra;
}