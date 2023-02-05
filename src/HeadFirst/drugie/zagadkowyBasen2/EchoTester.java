package HeadFirst.drugie.zagadkowyBasen2;

public class EchoTester {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo(); // by wynik wyszedł 10 na końcu
//      Echo e2 = e1; // by wynik wyszedł 24 na końcu
        int x=0;
        while ( x < 4 ){
            e1.witaj();
            e1.ilosc = e1.ilosc + 1;
            if (x == 3)
            {
                e2.ilosc = e2.ilosc + 1;
            }
            if (x > 0)
            {
                e2.ilosc = e2.ilosc + e1.ilosc;
            }
            x = x +1;
        }
        System.out.println(e2.ilosc);
    }
}

class Echo {
    int ilosc = 0;
    void witaj() {
        System.out.println("sieeeeeeemasz...");
    }
}