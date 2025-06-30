int main() {
    FILE* csvFile = fopen("/tmp/disneyplus.csv", "r");
    //FILE* csvFile = fopen("/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv", "r");

    if(csvFile == NULL) {
        perror("Erro ao abrir o arquivo");
        return 1;
    }

    Show* shows[MAX_SHOWS];     //Array de Show Principal
    int showCount = 0;

    char line[MAX_LINE];
    fgets(line, MAX_LINE, csvFile); //pula cabeçalho

    while(fgets(line, MAX_LINE, csvFile) && showCount < MAX_SHOWS) {
        line[strcspn(line, "\n")] = 0;
        shows[showCount++] = lerShow(line);
    }

    fclose(csvFile);


    Show* base[300];        //Array manipulável
    int baseCount = 0;

    char id[6];

    fgets(id, 6, stdin);
    id[strcspn(id, "\n")] = 0;

    while(strcmp(id, "FIM") != 0) {

        for(int i = 0; i < showCount; i++) {
            if(shows[i] != NULL && strcmp(getShowId(shows[i]), id) == 0) {

                base[baseCount++] = shows[i];
                break;
            }
        }

        fgets(id, 6, stdin);
        id[strcspn(id, "\n")] = 0;
    }


    int comp = 0, mov = 0;

    clock_t inicio = clock();

    //ordenação chamada

    clock_t fim = clock();

    double tempo = (double)(fim-inicio)/CLOCKS_PER_SEC;

    FILE *Log = fopen("./853033_selecaoRecursiva.txt","w");
    fprintf(Log,"853033\t%d\t%d\t%f", comp, mov, tempo);
	fclose(Log);

    for(int i = 0; i < baseCount; i++) {
        imprimirShow(base[i]);
    }


    return 0;
}