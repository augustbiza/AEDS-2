# Ponteiros e Arrays

## C
#### Em C Arrays se comportam como Ponteiro
```c
int a[3] = {3,4,5};     //Array
int* p = a;             //Ponteiro
```

#### Igualdade de Valor
```c
*p = *a
p[i] = *(p+i) = a[i] = *(a+i)
```
#### Igualdade de Endereço de Memória
```c
p = a
&p[i] = p+i = &a[i] = a+i
```

#### * e &
\* = valor e & = endereço
```c
int a = 5;
int* p = a;

p       //endereço do primeiro elemento
&p      //endereço
*p      //valor
*(&p)   //valor
&(*(&p))//endereço
&(*p)   //endereço
*(&(*p))//valor
```
<!------------------------------------------------------------------------------------------------------------------------>
## Java
#### Em Java um objeto "se comporta como Ponteiro"
```java
Pessoa p1;
```
##### p1 é um ponteiro do tipo Pessoa que no momento não guarda valor algum

```java
//class Pessoa
public Pessoa() {};

//Class Main
Pessoa p1 = new Pessoa();
```
##### p1 é um ponteiro do tipo Pessoa que guarda o endereço de um objeto Pessoa
##### O construtor nesse caso (sem parâmetros) inicializa os atributos de p1 com null e 0
```java
//class Pessoa
public Pessoa(String nome,int idade) {
    this.nome = nome;
    this.idade = idade;
}

//Class Main
Pessoa p2 = new Pessoa("Fulano", 21);
```
##### O construtor nesse caso (com parâmetros) inicializa os atributos de p2 com "Fulano" e 21
```java
Pessoa p4 = null;
```
##### p3 é um ponteiro do tipo Pessoa que guarda null
```java
Hora h1 = new Hora(10,10,10);
Hora h2 = new Hora(10,10,10);

Hora h3 = new Hora(7,50,10);
Hora h4 = h3;
```
#### h1 != h2 (h1 guarda o endereço de um objeto 'x' e h2 guarda de y, logo, apesar de x e y terem os mesmos valores nos atributos eles são objetos diferentes)
#### h3 == h4 (ambos guardam o endereço do mesmo objeto Hora)