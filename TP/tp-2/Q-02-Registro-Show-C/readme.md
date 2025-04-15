# 1. Constantes
```c
#define MAX_LINE 500
#define MAX_ID 6
#define MAX_SHOWS 1368
#define MAX_CAST 10
#define MAX_LISTED 10
```
#### MAX_LINE define a quantidade de char em um linha
#### MAX_ID define a quantidade de char para a antrada/input (exemplo máximo: s136x = 5 char)
#### MAX_SHOWS define a quantidade de structs Show
#### MAX_CAST define a quantidade máxima de elementos de cast
#### MAX_LISTED define a quantidade máxima de elementos de listed_in

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

# 3. main
```c
FILE* csvFile = fopen("/tmp/disneyplus.csv", "r");
//ou 
FILE* csvFile = fopen("/home/tmp/disneyplus.csv", "r");
```
#### 
####
####  

```c
if(csvFile == NULL) {
    perror("Erro ao abrir o arquivo");
    return 1;
}
```
#### Se o ponteiro não apontar para o arquivo (eu acho que essa definição está correta)
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

```c
char id[MAX_ID];
```
#### 

```c
fgets(id, MAX_ID, stdin);
```
#### Lê o show_id de entrada/input e coloca em id

```c
id[strcspn(id, "\n")] = 0;
```
#### Remove o '\n' que o fgets() deixa

```c
while(strcmp(id, "FIM") != 0)
```
#### Enquanto a entrada for diferente de "FIM"

```c
for(int i = 0; i < showCount; i++)
```
#### Percorre todos os Show lidos

```c
if(strcmp(getShowId(shows[i]), id) == 0)
```
#### Se o show_id de algum Show for igual ao show_id de entrada(id)

```c
imprimirShow(shows[i]);
break;
```
#### Mostra o Show e para a procura

```c
fgets(id, MAX_ID, stdin);
id[strcspn(id, "\n")] = 0;
```
#### Lê outra linha e retira o '\n'

```c
for(int i = 0; i < showCount; i++) {
    freeShow(shows[i]);
}
```
#### Leva cada ponteiro de Show para a função que da free(), ou seja, libera a memória alocada dinamicamente

# 4. createShowFromCSV


# 5. Sets


# 6. Gets


# 7. copyShow


# 5. freeShow
```c
void freeShow(Show* s) {
    if(s == NULL) return;   

    free(s->show_id);
    free(s->type);
    free(s->title);
    free(s->director);
    free(s->country);
    free(s->date_added);
    free(s->rating);
    free(s->duration);

    for(int i = 0; i < s->cast_count; i++) {
        free(s->cast[i]);
    }

    for(int i = 0; i < s->listed_in_count; i++) {
        free(s->listed_in[i]);
    }

    free(s);
}
```
Vamos analisar por partes
```c
void freeShow(Show* s)
```
#### A função recebe um ponteiro de um Show

```c
if(s == NULL) return;
```
#### Se o ponteiro estiver vazio ele não precisa desalocar memoria, loco retorna nada

```c
free(s->show_id);
free(s->type);
free(s->title);
free(s->director);
free(s->country);
free(s->date_added);
free(s->rating);
free(s->duration);
```
#### Libera a memória de cada ponteiro de atributo individualmente

```c
for(int i = 0; i < s->cast_count; i++) {
    free(s->cast[i]);
}

for(int i = 0; i < s->listed_in_count; i++) {
    free(s->listed_in[i]);
}
```
#### Libera a memória dos elementos ponteiros de cast e listed_in
#### Lembre-se que cast_count e listed_in_count são atributos da struct Show

```c
free(s);
```
#### Libera a struct Show inteira (que foi alocada com malloc em createShowFromCSV)