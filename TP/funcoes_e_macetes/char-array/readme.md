## Char características
### Tamanho em bytes do char:
#### c
```c
printf("%d\n",sizeof(char)); //1 (byte)
```
#### java
```java
System.out.println(Character.BYTES); //2 (bytes)
```
### Char é um inteiro.  
Os caraceteres são identificados por um núemro (int) na tabela **ASCII**  
#### C
```c
char ctr[] = "abcd";

ctr[0] = 'a' e ctr[0] = 97
ctr[1] = 'b' e ctr[1] = 98
ctr[2] = 'c' e ctr[2] = 98
ctr[3] = 'd' e ctr[3] = 100

printf("%d\n", ctr[0]);   // 97
printf("%c\n", ctr[0]);   // a
```
#### Java
```Java
char[] ctr = {'a','b','c','d'};

ctr[0] = 'a' e ctr[0] = 97
ctr[1] = 'b' e ctr[1] = 98
ctr[2] = 'c' e ctr[2] = 98
ctr[3] = 'd' e ctr[3] = 100
```
### Podemos fazer operações com o char
#### C
```c
for(int i = 0; i < tam2; i++) {
            str2[i] = str.charAt(i);            //copia a string para um char array

            str2[i] += 3;                       //troco o caractere na posição x da tabela ascii pelo x+3
        }
```
#### Java
```Java
for(int i = 0; i < tam2; i++) {
            str2[i] = str.charAt(i);            //copia a string para um char array

            str2[i] += 3;                       //troco o caractere na posição x da tabela ascii pelo x+3
        }
```