package Java1.Cwiczenia1;

public class Zadanie3 {
    public static void main(String[] args) {

        int a = (int) (Math.random()*100);
        int b = (int) (Math.random()*100);
        int c = (int) (Math.random()*100);

        System.out.println("Najwyższa liczba spośród trzech liczb to: ");

        if (a>b && a>c ) {
            System.out.println("odp to a: "+a+ " " + "a nie: "+b+ " czy "+c);
        } else if (b>a && b>c ) {
            System.out.println("Odp to b: "+b+ " " +"a nie: "+a+ " czy "+c);
        } else {
            System.out.println("odp to c: "+ c+ " " + "a nie: "+a+ " czy "+b);
        }
    }
}