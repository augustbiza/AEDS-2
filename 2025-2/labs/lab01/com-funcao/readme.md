# Lab 01 utilizando funções
## C
#### Bibliotecas
```c
#include <string.h>
```
#### Remover o \n
```c
str[strcspn(str, "\n")] = '\0';
```
#### Verificar se uma String é diferente de "FIM"
```c
strcmp(str, "FIM") != 0
```
#### Percorrer uma string
```c
for(int i = 0; str[i] != '\0'; i++)
```

## Java
#### Verificar se uma String é diferente de "FIM"
```java
if(!str.equals("FIM"))
```
#### Percorrer uma string
```java
for(int i = 0; i < str.length(); i++)
```