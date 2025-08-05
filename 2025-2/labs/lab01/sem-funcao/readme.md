# Lab 01 SEM utilizar funções
## C
#### Remover o \n
```c
for(int i = 0; str[i] != '\0'; i++) {
	if(str[i] == '\n') {
		str[i] = '\0';
		break;
	}
}
```
#### Verificar se uma String é diferente de "FIM"
```c
int verificaFim(char* str) {
	int ehFim = 0;
	if(str[0] == 'F' && str[1] == 'I' && str[2] == 'M' && str[3] == '\0') ehFim = 1;

	return ehFim;
}
```
#### Percorrer uma string
```c
for(int i = 0; str[i] != '\0'; i++)
```

## Java
#### Verificar se uma String é diferente de "FIM"
```java
public static boolean verificaFim(String str) {
	boolean ehFim = false;

	if(str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M') ehFim = true; 
		
	return ehFim;
}
```
#### Percorrer uma string
###### Foi-se necessário utilizar o médodo .length()
```java
for(int i = 0; i < str.length(); i++)
```