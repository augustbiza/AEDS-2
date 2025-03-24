# Funções/Métodos de Arrays em C e Java
## Ler uma String
#### C - scanf(" %[^\n], )
```c
//string
char str[15];

scanf(" %[^\n]", str);

// char

```
#### Java - scanner.nextLine()
```java
//String
String str = new String();

str = scanner.nectLine();

// char
char[] array = new char[15];
	    
for(int i = 0; i < 15; i++) {
    array[i] = scanner.next().charAt(0);
}
```
## Tamanho da String
#### C - strlen()
```c
int array[5];

int n = sizeof(array)/sizeof(array[0]);
```
#### Java - .lenght()
```java
String str = new String();
	    
str = "Augusto Bizarria";
	    
int n = str.length();
```
## Comparar Strings (iguais)
#### C - strcmp()
```c
char a[5], b[5];
    
scanf(" %[^\n]", a);
scanf(" %[^\n]", b);

if(strcmp(a, b) == 0) printf("A e B sao iguais");

if(strcmp(a, b) < 0) printf("A vem antes de B");

if(strcmp(a, b) > 0) printf("B vem antes de A");
```
#### Java - str.equals()
```java
String a = "Abacaxi";
String b = "Pera";
        
if(a.equals(b)) System.out.println("iguais");
else System.out.println("diferentes");
//ou
if(!a.equals(b)) System.out.println("diferentes");
else System.out.println("iguais");
```