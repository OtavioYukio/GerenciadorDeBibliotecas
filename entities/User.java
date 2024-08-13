package entities;

import java.util.List;
import java.util.Random;

import func.Client;

public class User {
    private String name;
    private Integer id;
    private String book;
    private Integer returnDay;
    private Double price;

    public User(String name, Integer id, String book, Integer returnDay) {
        this.name = name;
        this.id = id;
        this.book = book;
        this.returnDay = returnDay;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReturnDay() {
        return returnDay;
    }
    public void setReturnDay(Integer returnDay) {
        this.returnDay = returnDay;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }


    public Double calcTotal(Double price) {
        return (returnDay / 7) * price;
    }
    
    public void valuePrice(List<Book> list) {
        for (Book b : list) {
            if (b.getTitle() == this.book) {
                this.price = b.getPrice();
            }
        }
    }
    
    public String toString() {
        return "Nome: " + name + "\n" +
        "Id: " + id + "\n" +
        "Livro alugado: " + book + "\n" +
        "Dias alugados: " + returnDay + "\n" +
        "Preço total: " + this.price +"\n" +
        "-------------------------------------";
    }
}