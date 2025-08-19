# Ponteiros

## Conceitos
```c
int vet[3];
```
**vet** = endereço de memória do primeiro elemento do array vet  
**vet+i** = endereço de memória do elemento da posição i
**&vet[i]** = vet+i  
**\*vet** = valor do primeiro elemento do array vet  
**vet[0]** = \*vet  
**\*(vet+i)** = valor do elemento da posição i  
**vet[i]** = \*(vet+i)

### Exemplo
```c
int vetor[3];
vetor[0] = 1; vetor[1] = 2; vetor[2] = 3;
```
**vetor** = &vetor[0] = vetor+0  || **\*vetor = 1**  
**vetor[0]** = 1  |  **&vetor[0]** = endereço de memória(hex)  ||  **vetor+0** = endereço de memória(hex)  || **\*(vetor+0)** = 1  
**vetor[1]** = 2  |  **&vetor[1]** = endereço de memória(hex)  ||  **vetor+0** = endereço de memória(hex)  || **\*(vetor+0)** = 2  
**vetor[2]** = 3  |  **&vetor[2]** = endereço de memória(hex)  ||  **vetor+0** = endereço de memória(hex)  || **\*(vetor+0)** = 3  
