package Java1.Cwiczenia1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Jak masz na imię?");
        Scanner scan = new Scanner(System.in);
        String imie = scan.nextLine();
        System.out.println("Hello"+" "+imie);
    }
}
