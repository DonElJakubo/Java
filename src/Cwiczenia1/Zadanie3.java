package Cwiczenia1;

import static sun.swing.MenuItemLayoutHelper.max;

public class Zadanie3 {
    public static void main(String[] args) {


        int a = (int) (Math.random()*100);
        int b = (int) (Math.random()*100);
        int c = (int) (Math.random()*100);

        if (a>b && a>c ) {
            System.out.println("odp to a: "+a+ " " + "a nie: "+b+ "lub "+c);
        }
        else if (b>a && b>c )
        {
            System.out.println("Odp to b: "+b+ " " +"a nie: "+a+ "lub "+c);
        }
        else {
            System.out.println("odp to c: "+ c+ " " + "a nie: "+a+ "lub "+b);
        }
    }
}