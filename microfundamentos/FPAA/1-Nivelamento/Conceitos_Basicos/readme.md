# Conceitos Básicos
## O que é um Algoritmo?
Algoritmo é uma sequência clara de instruções que resolve um problema.  
Exemplos: manual de instruções, receitas, códigos de programação.
## Potenciação
Um número X elavado a y (X^y) é o produto de X por ele mesmo y vezes.  
##### Exemplos
x^2 = x . x  
5^3 = 5 . 5 . 5 = 125  
2^0.5 = raiz quadrada de 2  
##### Propriedades Importantes
0^0 = indeterminação
x^0 = 1 --> x^0 = x^1-1 = x^1 . x^-1 = x^1 / x^1
x^1 = x
## Logaritmo
Logaritmo de x na base 2 (log2 (x)) representa:
- quantas vezes devemos multiplicar a base por ela mesma até chegar em x (2*2*...2 = x)
-  quantas vezes devemos dividir x pela base até chegar em 1 ((x/2)*n = 1)
##### Exemplo: log10 (100)
I.  10^x = 100  -->  x = 2    
II. (100/10)*x = 1  -->  x = 2  
log10 (100) = 2
## Piso e Teto
Piso: maior número inteiro menor ou igual que a base  
Teto: menor número inteiro maior ou igual que a base  
- 3 (piso: 3, teto: 3)
- 1.27 (piso: 1, teto: 2)
- -2.5 (piso: -3, teto: -2)
## Funções
Cúbica:             f(x) = x^3  
Quadrática:         f(x) = x^2  
Linear-logaritmica  f(x) = x * log(x)  
Linear              f(x) = x  
Logarítmica         f(x) = log(x)  
Constante           f(x) = c
## Pesquisa/Busca: Sequencial x Binária
Ambos os métodos são utilizados para descobrir a existência de algo dentro de um array.
#### C, C++, Java  -  Busca Sequencial
```c
int chave, arr[5];
bool achou = false;

for(int i = 0; i < tam && !achou; i++) {

    if(arr[i] == chave) {
        achou = true;
    }
}
```
A Busca **Sequencial** procura em todas as posições do array verificando se a chave existe.
### C, C++, Java  -  Busca Binária
```c
int arr[5], chave, esq, meio, dir, tam;
bool achou = false;
    
chave = 6; tam = 5; esq = 0; dir = tam-1;
    
while(esq <= dir && !achou) {
        
    meio = (esq+dir)/2;
        
    if(arr[meio] == chave) {
        achou = true;
    }
    else if(chave <= meio) {
        dir = meio-1;
    }
    else {
        esq = meio+1;
    }
}
```