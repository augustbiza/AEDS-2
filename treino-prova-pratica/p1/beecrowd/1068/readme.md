# 1068 - Balanço Parênteses
## Explicação Java
```java
while(scan.hasNextLine())
```
O laço faz a leitura de string até não ter mais entradas.
```java
int c = 0;
```
A variável 'c' contabiliza o número de aparições de '(' e ')' é inicializada com 0.
```java
if(str.charAt(i) == '(') c++;
if(str.charAt(i) == ')') c--;
```
Se aparecer '(' c+1, se aparecer ')' c-1
```java
if(c < 0) {
    erro = true;
    i = n;
}

if(erro) System.out.println("incorrect");
```
Se o ')' aparecer antes de '(' já está errado, e sai do laço de verificação com "i=n"
```java
else  {
    if(c > 0) System.out.println("incorrect");
    else System.out.println("correct");
}
```
Esse else verifica se existem mais ')' do que '(', ou seja, c>0, se sim está errado
## Explicação C
```c
while (scanf(" %[^\n]", str) == 1)
```
O laço faz a leitura de uma string até ela retornar algo diferente de 1. Ou seja, a função scanf após fazer  
a leitura de algo retorna 1 se for válida.  
OBSERVAÇÃO: Caso a leitura fosse de dois em dois seria: while (scanf(" %[^\n]", str) == 2)
```c
while (scanf(" %[^\n]", str) != EOF)
```
O laço faz a leitura de string até não ter mais entradas.  
OBSERVAÇÃO: É possível que de **erro** caso a string possua um char especial e entre em looping infinito.
```java
int c = 0;
```
A variável 'c' contabiliza o número de aparições de '(' e ')' é inicializada com 0.
```java
if(str[i] == '(') c++;
if(str[i] == ')') c--;
```
Se aparecer '(' c+1, se aparecer ')' c-1
```java
if(c < 0) {
    erro = true;
    i = n;
}

if(erro) printf("incorrect\n");
```
Se o ')' aparecer antes de '(' já está errado, e sai do laço de verificação com "i=n"
```java
else {
    if(c > 0) printf("incorrect\n");
    else printf("correct\n");
}
```
Esse else verifica se existem mais ')' do que '(', ou seja, c>0, se sim está errado