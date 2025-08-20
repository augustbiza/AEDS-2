# Passando valores para args
### Código Java
```java
public static void main(String[] args) {
    try {
        Integer i = new Integer(args[0]);
        System.out.println(i);            
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("erro");
    }catch(NumberFormatException e){
        System.out.println("invalid format");
    }
}
```
### Compilar
```
javac Main.java
```
### Rodar sem passar parâmetros para "args"
```
java Main
```
##### TELA: erro
##### Explicação: como não foi passado valores para args, o aegs[0] não pode ser acessado, logo, erro em acessar posição inválida
### Rodar passando um Número INTEIRO
```
java Main 3
```
##### TELA: 3
### Rodar passando um parâmetro diferente de "int", como uma string ou float
```
java Main 3.7
//ou
java Main aracaju
```
##### TELA: invalid format
##### Se no lugar de "Integer i" for "String i" ambos os casos acima seria validos