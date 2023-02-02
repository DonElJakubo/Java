package brudnopis;


public class brudnopis1 {
    public static void main(String[] args) {

        int a = 0;

        while (a < 10) {
            a = a + 1;

            System.out.print(a+" ");

            if (a<5) {
                String opis = "liczba jest mniejsza niż 50% całości";
                System.out.println(opis);
            } else if (a==5) {
                String opis = "Liczba jest równa 50% całości";
                System.out.println(opis);
            }
            else {
                String opis = "liczba jest większa niż 50% całości";
                System.out.println(opis);
            }
        }
    }
}