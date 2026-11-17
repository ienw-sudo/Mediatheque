package Mediatheque.app.src.main.java.edu_info0502_tp1;

public class Book extends Media {
    private String author;

    public Book(String title, StringBuffer code, int rate, String author) {
        super(title, code, rate);
        this.author = author;
    }

    public Book(Book b) {
        super((Media) b);
        this.author = b.author;
    }

    public Book() {
        super();
        this.author = "John Doe";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
