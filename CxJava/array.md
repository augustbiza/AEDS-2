# Funções/Métodos de Arrays em C e Java
## Declarar e Inicializar um Array
#### C
```c
int array[5];

array[0] = 3;
array[1] = 7;
array[2] = 4;
array[3] = 1;
array[4] = 5;
```
#### Java
```java
int array = new int[]{3,7,4,1,5};
```
## Ler um Array
#### C
```c
// int
int array[5];

for(int i = 0; i < 5; i++) {
    scanf("%d", &array[i]);
}

// char
char array[15];

scanf(" %[^\n]", array);
```
#### Java
```java
// int
int[] array = new int[5];
	    
for(int i = 0; i < 5; i++) {      
    array[i] = scanner.nextInt();
}

// char
char[] array = new char[15];
	    
for(int i = 0; i < 15; i++) {
            
    array[i] = scanner.next().charAt(0);
}
```
## Tamanho do Array
#### C
```c
int array[5];

int n = sizeof(array)/sizeof(array[0]);
```
##### Observação: Array x Pointer
```c

    int* a = (int*)malloc(sizeof(int)*5);
    for(int i = 0; i < 5; i++) {
        a[i] = i+1;
    }
    
    int b[] = {1,2,3,4,5};

    int na = sizeof(a)/sizeof(a[0]);
    int nb = sizeof(b)/sizeof(b[0]);
    
    printf("Size A: %d  Size B: %d\n", na, nb);
```
Size A = tamanho do ponteiro  
Size B = tamanho do Array
#### Java - .length
```java
int[] array = new int[5];
	    
int n = array.length;
```
## Converter 'char array' para  String' (APENAS JAVA)
#### Java
```java
char[] array = new char[]{'a', 'n', 'a', 'b'};
	    
String str = new String(array);
	    
System.out.println(str);
```