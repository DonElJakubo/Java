package HeadFirst.drugie.Zgadywanka;

public class Gracz {
    int liczba = 0;
    public void zgaduj()
    {
        liczba = (int) (Math.random() *100);
        System.out.println("Typuję liczbę: "+liczba);
    }
}
