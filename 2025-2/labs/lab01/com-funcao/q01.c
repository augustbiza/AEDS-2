#include <stdio.h>
#include <string.h>

int contarMaiusculas(char* str) {
	int qt = 0;

	for(int i = 0; str[i] != '\0'; i++) {
		if(str[i] >= 65 && str[i] <= 90) qt++;
	}

	return qt;
}

int main(void) {

	char str[50];

	do{
		fgets(str, 50, stdin);
		str[strcspn(str, "\n")] = '\0';

		if(strcmp(str, "FIM") != 0 && str[0] != '\0') {
			printf("%d\n", contarMaiusculas(str));		
		}

	} while(strcmp(str, "FIM") != 0);

	return 0;
}
