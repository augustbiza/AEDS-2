//ler string
void lerStr(char* str) {

    scanf(" %[^\n\r]", str);
}

int main() {

    char* str = malloc(sizeof(char) * 1000);
    lerStr(str);
}