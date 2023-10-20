package exercisesOnComposition.authorAndBook2;

import java.util.Arrays;

public class Book {
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    private String name;
    private Author[] authors ;
    private double price;
    private int qty = 0;

    Book(String name,Author[] author, double price) {
        this.name = name;
        this.authors = author;
        this.price = price;
    }
    Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public String getAuthorName() {
        String name = "";
        for (var i = 0; i < authors.length; i++) {
            var values = authors[i];
            name += values.getName();
            if (i != authors.length - 1) {
                name += ",";
            }
        }
        return name;
    }

    public String toString() {
        String s = String.format("Book[name=%s,%s,price=%f,qty=%d]", name, Arrays.toString(authors), price, qty);
        return s;
    }
}

class TestBookAuthor1 {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy.getAuthorName());
        System.out.println(javaDummy);  // toString()
    }
}
