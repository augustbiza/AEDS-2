# 2482 - Etiquetas de Noel
## Explicação Java
```java
int qtIdiomas;

qtIdiomas = scan.nextInt();
```
**qtIdiomas** irá guardar o valor da quantidade de idiomas que será inserido
```java
scan.nextLine();
```
O comando de leitura é necessário pois após ler um inteiro a quebra de linha (\n) não é lida
```java
String[] idiomas = new String[qtIdiomas];
String[] felizNatal = new String[qtIdiomas];

for(int i = 0; i < qtIdiomas; i++) { 
    idiomas[i] = scan.nextLine();
    felizNatal[i] = scan.nextLine();
}
```
Os arrays guardarão o idioma e a frase traduzida no respectivo idioma.  
Exemplo:  
idiomas   [portugues ,    ingles     ,   frances ]  
felizNatal[felizNatal, merryChristmas, joyeuxNoel]  
posição        0            1               2  
Portanto, uma posição específica corresponde ao idioma e a sua respectiva tradução
```java
int qtPessoas;

qtPessoas = scan.nextInt();
```
**qtPessoas** irá guardar o valor da quantidade de pessoas que será inserido
```java
scan.nextLine();
```
O comando de leitura é necessário pois após ler um inteiro a quebra de linha (\n) não é lida
```java
String[] pessoas = new String[qtPessoas];
String[] nacionalidade = new String[qtPessoas];

for(int i = 0; i < qtPessoas; i++) {
    pessoas[i] = scan.nextLine();
    nacionalidade[i] = scan.nextLine();
}
```
Os arrays guardarão os nomes das pessoas e suas respectivas nacionalidades  
Exemplo:  
pessoas       [   Ana    , Jonas,   Paul]  
nacionalidades[portugues , ingles, frances]  
posição            0         1        2  
Portanto, uma posição específica corresponde ao nome e a sua respectiva nacionalidade
```java
for(int i = 0; i < qtPessoas; i++) {
    System.out.println(pessoas[i]);

    int pos = i;

    for(int j = 0; j < idiomas.length; j++) {
        if(idiomas[j].equals(nacionalidade[i])) {
            pos = j;
            j = idiomas.length;
        }
    }

    System.out.println(felizNatal[pos] + "\n");
}
```
```java
for(int i = 0; i < qtPessoas; i++) {
    System.out.println(pessoas[i]);
```
O 'i' terá a função de percorrer todas as pessoas do **array pessoas**
```java
for(int j = 0; j < idiomas.length; j++) {
    if(idiomas[j].equals(nacionalidade[i])) {
        pos = j;
        j = idiomas.length;
    }
}
```
O 'j' vai guardar a posição do array idioma que corresponde a nacionalidade da pessoa 'i'
## Explicação C