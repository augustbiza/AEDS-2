//strcmp(string, "FIM")

bool comparaFIM(char* str) {

    bool igual = false;

    if(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\0') igual = true;

    return igual;
}

int main(void) {

    char* str;

    do {

        scanf(" %[^\n]", str);

        if(!comparaFIM(str)) {
            //instruções
        }
    }while(!comparaFIM(str))
}