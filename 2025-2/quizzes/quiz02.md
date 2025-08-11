# Quiz 2 - Noções de Complexidade
Assunto:
### Pergunta 1
Informe o número de operações de multiplicação realizadas
```c
for(i = n-2; i > 5; i--) {
    a *= 2;
    b *= 3;
}
```
##### Resposta: 2(n-7) = 2n - 14

### Pergunta 2
Informe o número de operações de multiplicação realizadas no PIOR e MELHOR casos
```c
Ramdon gerador = new Ramdon();
gerador.setSeed(4);

for(int i = 0; i < n-4; i++) {
    if(Math.abs(gerador.nextInt() % 9 < 4)) {
        a*=2;
        b*=2;
        c*=2;
    }
    else if(Math.abs(gerador.nextInt() % 9 == 5)) {
        a*=2;
        b*=2;
    }
    else if(Math.abs(gerador.nextInt() % 9 > 5)) {
        a*=2;
    }
}
```
##### Resposta: PIOR: (n-4)*3 = laço for * primeiro if
##### Resposta: MELHOR: 0 = não entra em nenhum if-else

### Pergunta 3
Informe o número de operações de adição realizadas no PIOR e MELHOR casos
```c
if(n < a+3 && n > b+4 && n > c+1) {
    x += 2;
} else {
    x += 2; y += 2; k += 2; l += 2;
}

if(n <= b+4) {
    x += 2; y += 2; k += 2; l += 2;
} else {
    a += 2;
}
```
##### Resposta: PIOR: 12 = (n < a+3 = F),(n > b+4 = F),(n > c+1 = F), (n <= b+4 = V)
##### Resposta: MELHOR: 6 = (n < a+3 = V),(n > b+4 = V),(n > c+1 = V), (n <= b+4 = F)

### Pergunta 4
Informe o número de operações de adição realizadas no PIOR e MELHOR casos
```c
if(n < a+3 || n > b+4 || n > c+1) {
    x += 2;
} else {
    x += 2; y += 2; k += 2; l += 2;
}

if(n > b+4) {
    x += 2; y += 2; k += 2; l += 2;
} else {
    a += 2;
}
```
##### Resposta: PIOR: 9 = (n < a+3 = F), (n > b+4 = F), (n > c+1 = F), (n > b+4 = F)
##### Resposta: MELHOR: 4 = (n < a+3 = V),(n > b+4 = F)

### Pergunta 5
Indique a função de complexidade no PIOR e MELHOR casos para operações de adição
```c
for(i = n; i > 0; i=/2) {
    a += 2;
}
//ou
for(i = 1; i <= n; i*=2) {
    a += 2;
}
```
##### Resposta: f(x) = piso(log2(n)) + 1

### Pergunta 6
Indique a função de complexidade no PIOR e MELHOR casos para operações de adição
```c
for(i = n; i >= 1; i >>= 1) {
    a +=2;
}
```
##### Resposta: f(x) = piso(log2(n)) + 1

### Pergunta 7
Indique a função de complexidade no PIOR e MELHOR casos para operações de adição
```c
for(i = 1; i <= n; i <<= 1) {
    a +=2;
}
```
##### Resposta: f(x) = piso(log2(n)) + 1