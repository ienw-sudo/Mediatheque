package Mediatheque.app.src.main.java.edu_info0502_tp1;

public class Film extends Media {
    private String realisateur;
    private int year;

    public Film() {
        super();
        this.realisateur = "John Doe";
        year = 2000;
    }

    public Film(Film f) {
        super((Media) f);
        this.realisateur = f.realisateur;
        this.year = f.year;
    }

    public Film(String title, StringBuffer code, int rate, String realisateur, int year) {
        super(title, code, rate);
        this.realisateur = realisateur;
        this.year = year;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
