# Operadores de Deslocamento
Desloca o número no valor posicional na base 2
## >>
Divide por 2
```java
5 = 0101

5 = 5 >> 1
'0' + 0101 --> '0'010 = 0010
```
#### 5 >> 1 = 2  ==  5/2 = 2
## <<
Multiplica por 2
```java
5 = 0101

5 = 5 << 1
0101 + '0' --> 101'0' = 1010
```
#### 5 << 1 = 10  == 5*2 = 10
#### Java
```java
int x = 1011, y = 1011;
System.out.println("X: " + x + " Y: " + y);       
     
x = x << 1;
y = y >> 1;
System.out.println("X: " + x + " Y: " + y);
```
```
x = 11  y = 11
x = 22  y = 5
```
#### C
```java
int x = 6, y = 6;
printf("X: %d  Y: %d\n", x, y);       
     
x = x << 1;
y = y >> 1;
printf("X: %d  Y: %d\n", x, y);
```
```
x = 6  y = 6
x = 12 y = 3
```