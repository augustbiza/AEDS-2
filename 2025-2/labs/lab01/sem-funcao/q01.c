#include <stdio.h>

int verificaFim(char* str) {
	int ehFim = 0;
	if(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\0') ehFim = 1;

	return ehFim;
}

void removerQuebraLinha(char* str) {

	for(int i = 0; str[i] != '\0'; i++) {
		if(str[i] == '\n') {
			str[i] = '\0';
			break;
		}
	}
}

int contarMaiusculas(char* str) {
	int qt = 0;

	for(int i = 0; str[i] != '\0'; i++) {
		if(str[i] >= 65 && str[i] <= 90) qt++;
	}

	return qt;
}

int main(void) {

	char str[100];
	
	do{
		fgets(str, 50, stdin);
		removerQuebraLinha(str);

		if(!verificaFim(str) && str[0] != '\0') {
			printf("%d\n", contarMaiusculas(str));	
		}
	
	}while(!verificaFim(str));

	return 0;
}
