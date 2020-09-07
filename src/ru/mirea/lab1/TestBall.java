package ru.mirea.lab1;

public class TestBall
{
    public static void main (String [] args) {
        Ball d1 = new Ball ("Yellow", 500);
        Ball d2 = new Ball ("Blue",150);
        Ball d3 = new Ball ("Red");
        d3.setSize(100);
        //System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}