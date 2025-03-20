package org.example;

/**
 * Hello world!
 *
 */
import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "library")
@XmlAccessorType(XmlAccessType.FIELD)
public class App {
    @XmlElement(name = "book")
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

@XmlAccessorType(XmlAccessType.FIELD)
class Book {
    @XmlAttribute(name = "id", required = true)
    private int id;

    @XmlElement(name = "title", required = true)
    private String title;

    @XmlElement(name = "author", required = true)
    private String author;

    @XmlElement(name = "year", required = true)
    private int year;

    @XmlElement(name = "genre", required = true)
    private String genre;

    @XmlElement(name = "price", required = true)
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
