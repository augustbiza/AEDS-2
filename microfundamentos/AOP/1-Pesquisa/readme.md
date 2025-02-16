## Pesquisa em memória primária
A pesquisa em memória primária se da por dois caminhos: **sequencial** e **binária**.  
Ambas tem o objetivo de procurar um dado específico dentro de um array.
##### Exemplo
Queremos saber se o nome "Ana" está na lista de convidados:
```
array lista = [ Joao | Ana | Maria | Pedro | Júlia]  
tamanho do array(n) = 5
```
### Pesquisa Sequencial
Na pesquisa  **sequencial** vamos varrer o array em sequência.  
[ Joao | Ana | Maria | Pedro | **Júlia** ]  n = 5  
Julia = Ana ? **NÃO**
[ Joao | Ana | Maria | **Pedro** | ~~Julia~~ ]  n = 4  
Pedro = Ana ? **NÃO**  
[ Ana | Ana | **Maria** | ~~Pedro~~  | ~~Julia~~ ]  n = 3  
Maria = Ana ? **NÃO**  
[ Joao | **Ana** | ~~Maria~~ | ~~Pedro~~ | ~~Julia~~ ]  n = 2  
Ana = Ana ? **SIM**  
FIM DA EXECUÇÃO
### Pesquisa Binária
##### Na pesquisa binária o array precisa estar ordenado !
Na pesquisa  **binária** vamos procurar o dado sempre na metade do array.
n = 5  -->  m = 5/2  --> m = 2.5, porém se utiliza a parte inteira --> **m = 2**  
[ Ana | **Joao** | Julia | Maria | Pedro]  n = 5  
Joao = Ana ? **NÃO**  
Joao > Ana ? **SIM**  
Novo array = [ Ana | ~~Joao~~ | ~~Julia~~ | ~~Maria~~ | ~~Pedro~~]  n = 1  
Ana = Ana ? **SIM**  
FIM DA EXECUÇÃO
#### PESQUISA = BUSCA