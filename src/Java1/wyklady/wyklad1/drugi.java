package Java1.wyklady.wyklad1;

public class drugi {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        double wynik = x/y; // bez rzutowania
        double wynik2 = (double) x/y; // z zrzutowaniem
        System.out.println("pierwsza liczba to:"+x);
        System.out.println("druga liczba to:"+y);
        System.out.println("wynik dzielenia bez rzutowania to: "+wynik);
        System.out.println("wynik dzielenia z rzutowanie to: "+wynik2);
    }
}
