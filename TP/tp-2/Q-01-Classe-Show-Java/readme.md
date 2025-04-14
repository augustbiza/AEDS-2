# 1. Show Class

## 1 - Atributos
```java
private String show_id;
private String type;
private String title;
private String director;
private ArrayList<String> cast;
private String country;
private Date date_added;
private int release_year;
private String rating;
private String duration;
private ArrayList<String> listed_in;
```
#### Atributos(características) da Classe Show
#### Cast e ListedIn são coleções de arrays (ArrayList<>())
#### Director e Country apesar de poderem ter vários valores não são considerados ArrayList por comando da questão

## 2 - Construtores
3 construtores: vazio, atributos separados, linha do csv
```java
public Show() {
    
    this.show_id = "";
    this.type = "";
    this.title = "";
    this.director = "";
    this.cast = new ArrayList<String>();
    this.country = "";
    this.date_added = null;
    this.release_year = 0;
    this.rating = "";
    this.duration = "";
    this.listed_in = new ArrayList<String>();

    }
```
#### Construtor que não recebe parâmetros e inicializa todo mundo com vazio/null
```java
public Show(String show_id, String type, String title, String director, ArrayList<String> cast, String country, Date date_added, int release_year, String rating, String duration, ArrayList<String> listed_in) {

        this.show_id = show_id;
        this.type = type;
        this.title = title;
        this.director = director;
        this.cast = cast;
        this.country = country;
        this.date_added = date_added;
        this.release_year = release_year;
        this.rating = rating;
        this.duration = duration;
        this.listed_in = listed_in;
    }
```
#### Constutor que recebe os valores separados e coloca-os nos seus respectivos atributos
Coloquei no tópico 5 !!

## 3 - Gets
**Gets** são responsáveis por acessar valores de atributos privados.  
São métodos que possuem o retorno igual ao tipo do atributo a ser acessado e não recebem parâmetros.
```java
public String getShowId() { return show_id; }
public String getType() { return type; }
public String getTitle() { return title; };
public String getDirector() { return director; }

public String getCast() {

    if(cast == null || cast.isEmpty()) return "[NaN]";

    String cast = "[";

    for(int i = 0; i < this.cast.size(); i++) {

        cast += this.cast.get(i);

        if(i < this.cast.size() - 1) cast += ", ";
    }

    cast += "]";

    return cast;
}

public String getCountry() { return country; }
public Date getDateAdded() { return date_added; }
public int getReleaseYear() { return release_year; }
public String getRating() { return rating; }
public String getDuration() { return duration; }

public String getListedIn() {
        
    String listed_in = "[";

    for(int i = 0; i < this.listed_in.size(); i++) {

        listed_in += this.listed_in.get(i);

        if(i < this.listed_in.size() - 1) listed_in += ", ";
    }

    listed_in += "]";

    return listed_in;
}
```
#### public String getShowId() { return show_id; } retorna diretamente o valor do atributo "show_id".  
#### cast e listed_in são Arraylist<String> porém seus "gets" retornam uma String que concatena todos os elementos do ArratList<>
### getCast
```java
if(cast == null || cast.isEmpty()) return "[NaN]";
```
##### Se o cast estiver vazio retorne a String "NaN"
```java
String cast = "[";
```
##### O primeiro char da String cast precisa ser o início de um colchetes que guardará os valores de cast
```java
for(int i = 0; i < this.cast.size(); i++)
```
##### Esse loop percorre todo o ArratList<> cast
```java
cast += this.cast.get(i);
```
##### Concatena a String com os nomes de cast
```java
if(i < this.cast.size() - 1) cast += ", ";
```
##### Verifica se o elemento inserido é o último do ArratList<>, se não for adiciona uma vírgula e um espaço
```java
cast += "]";
```
##### Após adicionar todos os elementos do ArratList<> na String, coloca-se o último char da String indicando o fim
```java
return cast;
```
##### Retorna a String concatenada

#### getListedIn
```java
String listed_in = "[";
```
##### O primeiro char da String listed_in precisa ser o início de um colchetes que guardará os valores de cast
```java
for(int i = 0; i < this.listed_in.size(); i++)
```
##### Esse loop percorre todo o ArratList<> listed_in
```java
listed_in += this.listed_in.get(i);
```
##### Concatena a String com os nomes de listed_in
```java
if(i < this.listed_in.size() - 1) listed_in += ", ";
```
##### Verifica se o elemento inserido é o último do ArratList<>, se não for adiciona uma vírgula e um espaço
```java
listed_in += "]";
```
##### Após adicionar todos os elementos do ArratList<> na String, coloca-se o último char da String indicando o fim
```java
return listed_in;
```
##### Retorna a String concatenada

## 4 - Sets
**Sets** são responsáveis por atribuir valores aos atributos de um objeto  
São métodos que não possuem retorno, tipo void, e recebem parâmetros que serão colocados nos atributos da classe Show
```java
public void setShowId(String show_id) { this.show_id = show_id; }
public void setType(String type) { this.type = type; }
public void setTitle(String title) { this.title = title; }
public void setDirector(String director) { this.director = director; }
public void setCast(ArrayList<String> cast) { this.cast = cast; }
public void setCountry(String country) { this.country = country; }
public void setDateAdded(Date date_added) { this.date_added = date_added; }
public void setReleaseYear(int release_year) { this.release_year = release_year; }
public void setRating(String rating) { this.rating = rating; }
public void setDuration(String duration) { this.duration = duration; }
public void setListedIn(ArrayList<String> listed_in) { this.listed_in = listed_in; }
```

## 5 - Construtor Principal
```java
public Show(String linha) throws ParseException {

    String[] item = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", 12);

    setShowId(item[0].trim());
    setType(item[1].trim());
        
    String newTitle = item[2].trim().replace("\"", "");     //removendo aspas do title
    setTitle(newTitle);

    // Director (pode ser vazio)
    String newDirector = item[3].trim().replace("\"", "");
    setDirector(newDirector.isEmpty() ? null : newDirector);    

    // Cast (pode ser vazio)
    ArrayList<String> castList = new ArrayList<>();
    String elencoBruto = item[4].replaceAll("\"", "").trim();
    if(!elencoBruto.isEmpty()) {
        for (String actor : elencoBruto.split(",")) {
            if (!actor.trim().isEmpty()) {
                castList.add(actor.trim());
            }
        }
    }
    setCast(castList);
    insertionSort(this.cast);   //ordena cast

    // Country (pode ser vazio)
    String newCountry = item[5].replaceAll("\"", "").trim();
    setCountry(newCountry.isEmpty() ? null : newCountry);

    // Date added (pode ser vazia)
    String newDate = item[6].replaceAll("\"", "").trim();
    if(!newDate.isEmpty()) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
        setDateAdded(sdf.parse(newDate));
    }
    else {
        setDateAdded(null);
    }

    setReleaseYear(Integer.parseInt(item[7].trim()));
    setRating(item[8].trim());
    setDuration(item[9].trim());

    // Listed_in
    ArrayList<String> genreList = new ArrayList<>();
    String generoBruto = item[10].replaceAll("\"", "").trim();

    for (String genre : generoBruto.split(",")) {
        if (!genre.trim().isEmpty()) {
            genreList.add(genre.trim());
        }
    }

    setListedIn(genreList);
    insertionSort(this.listed_in);  //ordena listed in

}
```
Vamos analizar por partes
```java
public Show(String linha)
```
#### Construtor recebe uma linha do csv

```java
String[] item = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", 12);
```
#### Divide a linha por vírgulas respeitando as vírgulas dentro de aspas
#### Coloca cada parte um um array de String (12 partes no total)

### setShowId, setRating, setDuration
```java
setShowId(item[0].trim());
setType(item[1].trim());
//
setReleaseYear(Integer.parseInt(item[7].trim()));
setRating(item[8].trim());
setDuration(item[9].trim());
```
#### item[0] equivale ao primeiro dado do csv que corresponde ao show_id
#### trim() remove os espaços depois das vírgulas
#### Esse dado é setado em show_id pela função "setShowId()"
#### O mesmo ocorre para type, release_year, rating e duration

### setTitle, setdirector, setCountry
```java
String newTitle = item[2].trim().replace("\"", "");
setTitle(newTitle);
```
#### item[2] equivale ao terceiro dado do csv que corresponde ao title
#### item[2].trim().replace("\"", "") remove as aspas do título, 
#### A String newTittle recebe a String anterior sem as aspas
#### Esse dado é setado em title pela função "setTitle()"
#### O mesmo ocorre para director e country

### setDateAdded
```java
String newDate = item[6].replaceAll("\"", "").trim();
SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
if(!newDate.isEmpty()) setDateAdded(sdf.parse(newDate));
else setDateAdded(sdf.parse("March 1, 1900"));
```
#### item[6] equivale ao sétimo dado do csv que corresponde ao date_added
#### item[6].replaceAll("\"", "").trim() remove as aspas e espaços em branco depois da vírgula
#### sdf.parse(newDate) transforma a String newDate em SimpleDateFormat("MMMM d, yyyy")
#### Se esse dado for null é setado "March 1, 1900" em setDateAdded(sdf.parse("March 1, 1900"))
#### se ele existir é setado em title pela função "setDateAdded(sdf.parse(newDate))"

### setCast e setListedIn
```java
ArrayList<String> castList = new ArrayList<>();
String elencoBruto = item[4].replaceAll("\"", "").trim();
if(!elencoBruto.isEmpty()) {
    for(String actor : elencoBruto.split(",")) {
        if(!actor.trim().isEmpty()) {
            castList.add(actor.trim());
        }
    }
}
setCast(castList);
insertionSort(this.cast);
```
#### Cria um novo ArrayList<String> chamado castList que será parâmetro da função "setCast()"
#### item[4] equivale ao quinto dado do csv que corresponde ao cast
#### Cria uma String (elencoBruto) que recebe o valor de cast sem aspas e espaços depois da vírgula
#### String actor : elencoBruto.split(",") separa os elementos da String elencoBruto por vírgula
#### Se o elemento do ArrayList<> não for null adiciona ele no ArrayList<> castList castList.add(actor.trim())
#### setCast(castList) seta o atributo cast com o ArrayList<String> castList
#### insertionSort(this.cast) ordena o ArrayList<> cast em ordem alfabética com o insertion sort
```java
ArrayList<String> genreList = new ArrayList<>();
String generoBruto = item[10].replaceAll("\"", "").trim();

for(String genre : generoBruto.split(",")) {
    if(!genre.trim().isEmpty()) {
        genreList.add(genre.trim());
    }
}

setListedIn(genreList);
insertionSort(this.listed_in);
```
#### Cria um novo ArrayList<String> chamado genreList que será parâmetro da função "seListedIn()"
#### item[10] equivale ao decimo primeiro dado do csv que corresponde ao listed_in
#### Cria uma String (generoBruto) que recebe o valor de listed_in sem aspas e espaços depois da vírgula
#### String genre : generoBruto.split(",") separa os elementos da String generoBruto por vírgula
#### Se o elemento do ArrayList<> não for null adiciona ele no ArrayList<> genreList genreList.add(genre.trim())
#### setListedIn(genreList) seta o atributo listed_in com o ArrayList<String> genreList
#### insertionSort(this.listed_in) ordena o ArrayList<> listed_in em ordem alfabética com o insertion sort

## 6 - Insertion Sort

# 2. Main Class
```java
String csvFile = "/tmp/disneyplus.csv";
//ou
String csvFile = "/home/AED-2/TP/tp-2/tmp/disneyplus.csv";
```
#### A String csvFile armazena o caminho do arquivo csv
#### O primeiro é para o verde e o segundo é onde o arquivo csv está na minha minha máquina

```java
ArrayList<Show> shows = new ArrayList<Show>();
```
#### Cria um ArrayList do tipo Show para adicionar objetos do arquivo csv

```java
try {
    Scanner scan = new Scanner(new File(csvFile));
    scan.nextLine();  

    while (scan.hasNextLine()) {
        shows.add(new Show(scan.nextLine()));
    }

    scan.close();
} catch(Exception e) { }
```
Vamos analisar por partes
```java
Scanner scan = new Scanner(new File(csvFile));
```
#### O Scanner vai ler o arquivo

```java
scan.nextLine();
```
#### Lê a primeira linha e ignora, pois ela é o cabeçalho

```java
while(scan.hasNextLine()) {
    shows.add(new Show(scan.nextLine()));
}
```
#### scan.hasNextLine() faz a leitura linha por linha do arquivo csv
#### while(scan.hasNextLine()) = enquanto tiver linha para ler
#### shows.add(new Show(scan.nextLine())) adiciona objetos do tipo Show no ArrayList<Show> shows

```java
scan.close();
} catch(Exception e) { }
```
#### Fecha o Scanner e trata a exceção, porém sem mensagem de erro

```java
Scanner scan = new Scanner(System.in);
```
#### Abre um arquivo para ler o input da questão (s156 por exemplo)

```java
scan.nextLine();
```
#### Lê a primeira linha e ignora, pois ela é o cabeçalho

```java
String input = scan.nextLine();
```
#### A entrada/input é armazenada na String input (s156 por exemplo)

```java
while(!input.equals("FIM"))
```
#### Enquanto o input for diferente de FIM

```java
for(Show show : shows)
```
#### Vai percorrer todos os objetos de Show lidos do arquivo e armazenados no ArrayList<Show> shows

```java
if(show.getShowId().equals(input))
```
#### Se o show_id de algum objeto do ArrayList<Show> shows for igual à entrada (input que é um show_id)
```java
show.imprimir();
break;
```
#### Mostra o objeto
#### Para a procura com o break

```java
input = scan.nextLine();
```
#### Faz a leitura de uma nova entrada/input