package ru.mirea.lab1;

public class TestBook {
    public static void main (String [] args) {
        Book d1 = new Book ("Mai", 666);
        Book d2 = new Book ("12 chairs'",488);
        Book d3 = new Book ("Hyrry Poter'");
        d3.setPages(8008);
        System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}
