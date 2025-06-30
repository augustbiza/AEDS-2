#include <stdio.h>
#include <stdlib.h>
#include <wchar.h>
#include <locale.h>
#include <string.h>

void inverteString(wchar_t* str, int i, int f) {
    wchar_t aux;

    if (i < f / 2) {
        aux = str[i];
        str[i] = str[f - 1 - i];
        str[f - 1 - i] = aux;

        inverteString(str, i + 1, f);
    }
}

int main(void) {
    wchar_t* str = malloc(sizeof(wchar_t) * 1000);
    wchar_t* str2 = malloc(sizeof(wchar_t) * 1000);

    if (str == NULL) {
        fwprintf(stderr, L"Erro ao tentar alocar memória !!\n");
        return 1;
    }

    setlocale(LC_ALL, ""); // coloca o local pro sistema do usuário pra suportar char especial

    do {
        fgetws(str, 1000, stdin);   //fgets()
        wcscpy(str2, str);

        int len = wcslen(str);
        if (len > 0 && str[len - 1] == L'\n') { //verifica se string não ta vazia e se o ultimo char for o \n
            str[len - 1] = L'\0';               //se for remove o \n  
        }

        int tam = wcslen(str);

        inverteString(str, 0, tam);

        if (wcscmp(str2, L"FIM\n") != 0) {     //strcmp()

            wprintf(L"%ls\n", str);
        }

    } while (wcscmp(str2, L"FIM\n") != 0);

    free(str);
    free(str2);

    return 0;
}