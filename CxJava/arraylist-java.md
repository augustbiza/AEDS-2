# ArrayList<> - Java
## Foco de Strings --> ArrayList<String>
## Declaração
```java
ArrayList<String> lista = new ArrayList<>();
```
## Tamanho (Quantidade de elementos inseridos)
```java
int tam = lista.size();
```
## Mostrar
```java
for(String str : lista) {
    System.out.print(str);
}
```
## Adicionar Elementos
### Final
```java
lista.add("Augusto");
```
### Posição Específica
```java
lista.add(0, "Carlos");             //adiciona na posição 0
lista.add(lista.size(), "Maria");   //adiciona na última posição
```
## Remover Elementos {por posição x por valor}
### Remover Elemento de uma Posição específica
```java
lista.remove(0);     //remove o elemento da posição 0
lista.remove(3);    //remove o elemento da posição 3
```
### Remover Elemento por Valor específico`
```java
lista.remove("Augusto");    //remove o elemento "Augusto" do arraylist<string>
lista.remove("João");       //não vai acontecer nada porque não existe o elemento "João"
```
## Trocar Elementos {posição e novo valor}
```java
lista.set(0, "Jonas");      //troquei o valor da posição 0 por "Jonas"
lista.set(lista.size(), "Caio");    //ERRO, pois a posição size() nunca terá valor, sendo assim não da pra trocar
```
## Procurar elemento
```java
String str = lista.get(2);  //guardo o valor da posição 2
```
## Verificar se tem algum Elemento Específico
```java
//verifica se no arraylist possui o valor "Pedro"
if(lista.contains("Pedro")) System.out.println("SIM");
else System.out.println("NÃO");
```
## Verificar se esta Vazio
```java
if(lista.isEmpty()) System.out.println("vazio");
else System.out.println("NÃO vazio");
```
## Limpar-Esvaziar
```java
lista.clear();
```
## Posição de um valor específico
```java
int pos = lista.indexOf("Ana");     //retorna a posição do valor "Ana"
```