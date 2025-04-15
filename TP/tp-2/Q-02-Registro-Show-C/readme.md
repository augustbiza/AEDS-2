# 1. Constantes
```c
#define MAX_LINE 500
#define MAX_INPUT 10
#define MAX_SHOWS 1368
#define MAX_CAST 10
#define MAX_LISTED 10
```
#### MAX_LINE define a quantidade de char em um linha
#### MAX_INPUT
#### MAX_SHOWS
#### MAX_CAST
#### MAX_LISTED

# 2. Struct Show
```c
typedef struct {
    char* show_id;
    char* type;
    char* title;
    char* director;
    char* cast[MAX_CAST];
    int cast_count;
    char* country;
    char* date_added;
    int release_year;
    char* rating;
    char* duration;
    char* listed_in[MAX_LISTED];
    int listed_in_count;
} Show;
```
#### cast e listed_in são ponteiros para arrays, ou seja, um array 2d(Array de String em Java)

## Funções para acessar/manipular a struct Show
### 

# . main
```c
FILE* csvFile = fopen("/tmp/disneyplus.csv", "r");
//ou 
FILE* csvFile = fopen("/home/augustobiza/CCPUC/AED-2/TP/tp-2/tmp/disneyplus.csv", "r");
```
#### 
####
####  

```c
if(!csvFile) {
    perror("Erro ao abrir o arquivo");
    return 1;
}
```
#### Se não conseguir abrir o arquivo mostra uma mensagem de erro

```c
Show* shows[MAX_SHOWS];
```
#### Cria um array de Show

```c
int showCount = 0;
```
#### Indica a contagem de Show lidos, iniciada com 0

```c
char line[MAX_LINE];
```
#### line é a variável que armazenará a linha do csv

```c
fgets(line, MAX_LINE, csvFile);
```
#### Lê a primeira linha e ignora, pois ela é o cabeçalho

```c
while(fgets(line, MAX_LINE, csvFile) && showCount < MAX_SHOWS)
```
#### Equanto tiver linha para ler
#### Equanto o número de Show lidos (showCount) for menor que o máximo de Show(MAX_SHOWS = 1368)
#### Copia a linha do csv para o line

```c
line[strcspn(line, "\n")] = 0;
```
#### Remove o '\n' do final da linha

```c
shows[showCount++] = createShowFromCSV(line);
```
#### Adiciona uma struct Show ao array de Show na posição showCount (shows[showCount++])
#### 

```c
fclose(csvFile);
```
#### Fecha o arquivo

