# 1. Show Class - Java
## Class Show
```java
public Show(String show_id, String type, String title, ArrayList<String> director, ArrayList<String> cast, ArrayList<String> country, String date_added, int release_year, String rating, String duration, ArrayList<String> listed_in, String description) {
    setShowId(show_id);
    setType(type);
    setTitle(title);
    setDirector(director);
    setCast(cast);
    setCountry(country);
    setDateAdded(date_added);
    setReleaseYear(release_year);
    setRating(rating);
    setDuration(duration);
    setListedIn(listed_in);
    setDescription(description);
}
```
#### Construtor que recebe os dados separados por tipo e os insere nos atributos do objeto criado

```java

```
####

```java
public Show clone() {
    Show clone = new Show(getShowId(), getType(), getTitle(), getDirector(), new ArrayList<>(getCast()), getCountry(), getDateAdded(), getReleaseYear(), getRating(), getDuration(), new ArrayList<>(getListedIn()), getDescription());

    return new clone;
}
```
#### Método clone que copia um objeto sem que eles estejam interligados. Isso permite que alterações no original não interfiram no clone e VICE VERSA

## Class Main
```java
ArrayList<Show> = new ArrayList<Show>();
```
#### Cria uma lista de objetos Show