# Ponteiro C - I
## Introdução
```c
int arr[3];
```
O dado **arr** aloca espaço para 3 dados int.  
O dado **arr** é uma variavel ponteiro que guarda o endereço de memória para o primeiro dado do vetor(**arr[0]**)

## Como inicializar um ponteiro em C
### Atribuindo valor diretamente
```c
int x = 10;

int* ptr = &x
```
O dado ponteiro **ptr** guarda o endereço de memória do dado int **x**
### Inicializando com NULL
```c
int* ptr = NULL;
/*ou*/
int* ptr = 0;
```
### Alocação Dinâmica
#### malloc
```c
int* ptr;
ptr = (int*) malloc(sizeof(int));
/*ou*/
int* ptr = (int*) malloc(sizeof(int));
```
#### calloc
Calloc é uma espécie de malloc onde todos os elementos são inicializados com **0** (números) ou **ascci de \n** (char)
```c
int* ptr;
ptr = (int*) calloc(sizeof(int));
/*ou*/
int* ptr = (int*) calloc(sizeof(int));
```

##