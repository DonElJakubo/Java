package Cwiczenia1;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println("Podaj kwotę pomiędzy 1000 a 500,000 PLN");
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        if (price >= 1000 && price <= 500000) {
            System.out.println("Podaj ilość miesięcy na ile chcesz wziąć kredyt (pomiędzy 12 a 60 miesięcy)");
            int numberOfPayments = scan.nextInt();

            double interestRate;
            if (numberOfPayments >= 1 && numberOfPayments <= 12) {
                interestRate = 0.09;
            } else if (numberOfPayments >= 13 && numberOfPayments <= 24) {
                interestRate = 0.08;
            } else if (numberOfPayments >= 25 && numberOfPayments <= 48) {
                interestRate = 0.06;
            } else if (numberOfPayments >= 49 && numberOfPayments <= 60) {
                interestRate = 0.04;
            } else {
                if (numberOfPayments < 12){
                    System.out.println("za mała liczba miesięcy");
                }
                if (numberOfPayments > 60) {
                    System.out.println("za duża liczba miesięcy");
                }
                return;
            }

            float monthlyPayment = (float) (price * interestRate) / (float) (1 - Math.pow(1 + interestRate, -numberOfPayments));
            System.out.println("Miesięczne opłaty: " + monthlyPayment + " PLN");
        } else {
            if (price < 1000){
                System.out.println("podałeś liczbę mniejszą niż 1000 PLN");
            }
            if (price > 500000){
                System.out.println("podałeś liczbę większą niż 500,000 PLN");
            }
        }
    }
}
