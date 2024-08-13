package entities;

public class Book {
    private String title;
    private String author;
    private String genre;
    private Double price;

    public Book(String title, String author, String genre, Double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "Titulo: " + title + "\n" +
        "Autor: " + author + "\n" +
        "Genero: " + genre + "\n" +
        "Preço: " + price + "\n" +
        "-------------------";
    }

}
