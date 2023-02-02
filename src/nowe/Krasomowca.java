package nowe;

public class Krasomowca {
    public static void  main(String[] args) {
        String[] listaSlow1 = {"architektura wielowarstwowa", "3000 metrów", "rozwiązanie B-do-B", "aplikacja kliencka", "" +
                "interfejs internetowy", "inteligenta karta", "rozwiązanie dynamiczne", "sześć sigma", "przenikliwość"};
        String[] listaSlow2 = {"zwiększa możliwość", "poprawia atrakcyjność", "pomnaża wartpść", "opracowana dla", "bazująca na",
                "rozproszona", "sieciowa", "skoncentrowana", "podniesiona na wyższy poziom", "skierowanej", "udostępniona"};
        String[] listaSlow3 = {"procesu", "punkt wpisywania", "roziwązania", "strategii", "paradygmatu", "portalu", "witryny", "wersji", "misji"};

        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;
        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista2Dlugosc);
        int rnd3 = (int) (Math.random() * lista3Dlugosc);
        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];
        System.out.println("To jest to, czego nam potrzeba: " + zdanie);
    }
}
