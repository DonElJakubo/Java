package Java1.wyklady.wyklad2;

import java.util.Random;

public class wakajki {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomMonth = rand.nextInt(12)+1;
        String month = "";
        switch(randomMonth){
            case 1 : month = "Styczeń";
                break;
            case 2 : month = "Luty";
                break;
            case 3 : month = "Marzec";
                break;
            case 4 : month = "Kwiecień";
                break;
            case 5 : month = "Maj";
                break;
            case 6 : month = "Czerwiec";
                break;
            case 7 : month = "Lipiec";
                break;
            case 8 : month = "Sierpień";
                break;
            case 9 : month = "Wrzesień";
                break;
            case 10 : month = "Październik";
                break;
            case 11 : month = "Listopad";
                break;
            case 12 : month = "Grudzień";
                break;
        }
        int tydzien = (int) (Math.random()*4);
        System.out.println("Kalendarz z miesiącami oraz co polecam robić w ich poszczególnych tygocniach:");

        switch (month) {
            case "Styczeń":
                System.out.println("Styczeń - Idealny na sporty zimowe");
                System.out.println("W tym tygodniu polecam: ");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: narty");
                        break;
                    case 2:
                        System.out.println("tydzień drugi: sanki");
                        break;
                    case 3:
                        System.out.println("tydzień trzeci: zimowe zjeżdalnie ");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("inne jakieś ale zimowe");
                        break;
                } break;
            case "Luty":
                System.out.println("Luty - dalej zimowe");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: narty");
                        break;
                    case 2:
                        System.out.println("tydzień drugi: sanki");
                        System.out.println("sanki");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("zimowe zjeżdalnie ");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("inne jakieś ale zimowe");
                        break;
                } break;
            case "Marzec":
                System.out.println("Marzec- Już wiosenne");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: rolki");
                        break;
                    case 2:
                        System.out.println("tydzień drugi: sanki");
                        System.out.println("wrotki");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("basen zamknięty ");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("wspinaczka");
                        break;
                } break;
            case "Kwiecień":
                System.out.println("Kwiecień - dalej wiosenne");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: wspinaczka");
                        break;
                    case 2:
                        System.out.println("tydzień drugi: sanki");
                        System.out.println("basen zamknięty");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("rower");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("bieganie");
                        break;
                }break;
            case "Maj":
                System.out.println("Maj - no majówka to można się napić");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: pijemy");
                        break;
                    case 2:
                        System.out.println("tydzień drugi: sanki");
                        System.out.println("bieganie");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("rower");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("wspinaczka");
                        break;
                }break;
            case "Czerwiec":
                System.out.println("Czerwiec - no to już lato");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: pływanie");
                        break;
                    case 2:
                        System.out.println("tydzień drugi: sanki");
                        System.out.println("skoki ze spadochronu");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("rower ");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("piłka nożna");
                        break;
                }break;
            case "Lipiec":
                System.out.println("Lipiec - trochę odpoczynku więc zwiedzanie i leżenie");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: ciepło więc odpoczywamy");
                        break;
                    case 2:
                        System.out.println("tydzień drugi: sanki");
                        System.out.println("dalej na leniwo");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("można pozwiedzać HeadFirst.nowe miejsca ");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("wyjazdy na wakajki");
                        break;
                }break;
            case "Sierpień":
                System.out.println("Sierpień -  ciepło więc nad morzem ");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: pływanie");
                        break;
                    case 2:
                        System.out.print("tydzień drugi: ");
                        System.out.println("deptaki w świeradowie i leniuchowanie");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("motor ");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("dalej motor");
                        break;
                }break;
            case "Wrzesień":
                System.out.println("Wrzesień - ostatni miesiąc dla studentów");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: wspinaczka");
                        break;
                    case 2:
                        System.out.print("tydzień drugi: ");
                        System.out.println("basen zakryty");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("rower");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("ostatnia szansa na tygodniowy wypad");
                        break;
                }break;
            case "Październik":
                System.out.println("Październik - no to jesień mocna i zimna");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: pada więc niezbyt");
                        break;
                    case 2:
                        System.out.print("tydzień drugi: ");
                        System.out.println("pewnie dalej słaba pogoda to w domku");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("już zimno ale dużo błota");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("jak jest jakiś śnieg to stopnieje za godzine");
                        break;
                }break;
            case "Listopad":
                System.out.println("Listopad - początek zimy to można sporty ziomowe jakieś");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: zwiedzanie gór");
                        break;
                    case 2:
                        System.out.print("tydzień drugi: ");
                        System.out.println("jakieś wyjazdy za granicę bo w innych krajach jeszcze ciepło");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("odpoczywanko");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("może już narty jak jest śnieg");
                        break;
                }break;
            case "Grudzień":
                System.out.println("Grudzień - Na święta to mniej ale też można");
                switch (tydzien) {
                    case 1:
                        System.out.println("tydzień pierwszy: Mikołaj to odpoczywamy");
                        break;
                    case 2:
                        System.out.print("tydzień drugi: ");
                        System.out.println("tu można jakieś narty");
                        break;
                    case 3:
                        System.out.print("tydzień trzeci: ");
                        System.out.println("przygotowujemy się do świąt");
                        break;
                    default:
                        System.out.print("tydzień czwarty: ");
                        System.out.println("święta, jemy i sił nie mamy ");
                        break;
                }break;
        }
    }
}
