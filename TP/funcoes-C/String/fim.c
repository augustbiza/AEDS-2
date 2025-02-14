//strcmp(string, "FIM")

bool comparaFIM(char* palavra) {

    bool igual = false;

    if(palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M' && palavra[3] == '\0') igual = true;

    return igual;
}

int main(void) {

    char* palavra;

    do {

        scanf(" %[^\n]", palavra);

        if(!comparaFIM(palavra)) {
            //instruções
        }
    }while(!comparaFIM(palavra))
}