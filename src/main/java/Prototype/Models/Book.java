package Prototype.Models;

public class Book {
    private String name;
    private int price;
    private Person writer;

    public Book(String name, int price, Person writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return new Book(name,price,writer.clone());
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Person getWriter() {
        return writer;
    }
}
