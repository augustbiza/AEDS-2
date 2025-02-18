//ler string
char* lerPalavra(void) {

    char* palavra = malloc(sizeof(char) * 100);
    scanf(" %[^\n]", palavra);

    return palavra;
}