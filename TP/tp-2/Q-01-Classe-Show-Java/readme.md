# 1. Show Class - Java
## Class Show
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

```java
public Show(String linha) throws ParseException {

    String[] item = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", 12);

    setShowId(item[0].trim());

    setType(item[1].trim());

    //setTitle(item[2].trim());
    //removendo aspas do title
    String rawTitle = item[2].trim().replace("\"", "");
    setTitle(rawTitle.isEmpty() ? null : rawTitle);

    // Director (pode ser vazio)
    String rawDirector = item[3].trim().replace("\"", "");
    setDirector(rawDirector.isEmpty() ? null : rawDirector);    
    // Cast (pode ser vazio)
    ArrayList<String> castList = new ArrayList<>();
    String elencoBruto = item[4].replaceAll("\"", "").trim();
    if (!elencoBruto.isEmpty()) {
        for (String actor : elencoBruto.split(",")) {
            if (!actor.trim().isEmpty()) {
                castList.add(actor.trim());
            }
        }
    }
        
    setCast(castList);
    insertionSort(this.cast);   //ordena cast

    // Country (pode ser vazio)
    String rawCountry = item[5].replaceAll("\"", "").trim();
    setCountry(rawCountry.isEmpty() ? null : rawCountry);

    // Date added (pode ser vazia)
    String rawDate = item[6].replaceAll("\"", "").trim();
    if(!rawDate.isEmpty()) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
        setDateAdded(sdf.parse(rawDate));
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
#### Construtor da classe Show
```java
public Show(String linha)
```
#### Construtor que recebe uma linha do csv, correspondente a algum show
```java
String[] item = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", 12);
```
#### 


```java
public Show clone() {
    Show clone = new Show(getShowId(), getType(), getTitle(), getDirector(), new ArrayList<>(getCast()), getCountry(), getDateAdded(), getReleaseYear(), getRating(), getDuration(), new ArrayList<>(getListedIn()));

    return new clone;
}
```
#### Método clone que copia um objeto sem que eles estejam interligados. Isso permite que alterações no original não interfiram no clone e VICE VERSA

## Class Main
```java

```
#### 