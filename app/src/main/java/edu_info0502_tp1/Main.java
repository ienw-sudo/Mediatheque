package Mediatheque.app.src.main.java.edu_info0502_tp1;

/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        Media m1 = new Media("Kill Bill vol 1", new StringBuffer("2BXX5"), 5);
        System.out.println(m1);

        Library l = new Library();
        System.out.println(l);
    }
}