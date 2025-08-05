#include <stdio.h>

int verificaFim(char* str) {
	int ehFim = 0;
	if(str[0] == 'F' && str[1] == 'I' && str[2] == 'M') ehFim = 1;

	return ehFim;
}

int contarMaiusculas(char* str) {
	int qt = 0;

	for(int i = 0; str[i] != '\n'; i++) {
		if(str[i] >= 65 && str[i] <= 90) qt++;
	}

	return qt;
}

int main(void) {

	char str[50];

	do{
		fgets(str, 50, stdin);

		if(!verificaFim(str)) {
			printf("Maiusculas: %d\n", contarMaiusculas(str));	
		}
	
	}while(!verificaFim(str));

	return 0;
}
