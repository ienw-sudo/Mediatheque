package Mediatheque.app.src.main.java.edu_info0502_tp1;

import java.util.Vector;

public class Library {
    private String owner;
    private Vector<Media> medias;

    public Library(Library l) {
        this.owner = l.owner;
        this.medias = l.medias;
    }

    public Library() {
        this.owner = "john Doe";
        this.medias = new Vector<Media>();

        Film f = new Film();
        Book b = new Book();

        medias.add(f);
        medias.add(b);
    }

    public void add(Media m) {
        this.medias.add(m);
    }

    public String toString() {
        return "Owner: " + owner + " Total Media: " + medias.toArray().length;
    }
}
