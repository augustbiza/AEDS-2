# Ponteiros (C/C++) e ReferÊncia (Java)
## Exercício 1
Explique o que significa
```java
int[] array = new int[5]
```
#### Resposta
Isso representa uma alocação de memória para 5 dados **int**.  
O dado **array[5]** guarda o endereço de memória do primeiro int do vetor (**array[0]**)

## Exercício 2
Explique o que significa
```java
Cliente c = new Cliente();
```
O dado **c** é um ponteiro que aponta para um objeto instanciado da classe **Cliente**

## Exercício 3
Explique o código abaixo
```java
Cliente c1 = null, c2 = null, c3 = null;

c1 = new Cliente(1, "aa");
c2 = c1;
c3 = new Cliente(2, "bb");

escrever("ADDRs:\nc1(" + c1 + ")\nc2(" + c2 + ")\nc3(" + c3 + ")");

c2.setCodigo(3);
```
```java
Cliente c1 = null, c2 = null, c3 = null;
```
**c1**, **c2** e **c3** são ponteiros do tipo Cliente que não apontam para nada
```java
c1 = new Cliente(1, "aa");
```
O ponteiro **c1** guarda o endereço de memória de um objeto instanciado de Cliente com **atributos (1 e aa)**
```java
c2 = c1;
```
O ponteiro **c2 possui o MESMO valor de c1**, ou seja, guarda o mesmo endereço de memória que c1 guarda  
Logo, os atributos do qual **c2** aponta valem **atributos (1 e aa)**
```java
c3 = new Cliente(2, "bb");
```
O ponteiro **c3** guarda o endereço de memória de um objeto instanciado de Cliente com **atributos (2 e bb)**
```java
print("ADDRs:\nc1(" + c1 + ")\nc2(" + c2 + ")\nc3(" + c3 + ")");
```
**c1** e **c2** terão o mesmo valor, ja que ambos guardam o mesmo endereço de memória  
**c3** tem outro endereço de memória