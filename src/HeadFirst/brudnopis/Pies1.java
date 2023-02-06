package HeadFirst.brudnopis;

public class Pies1 {
    String imie;

    public static void main(String[] args) {
        Pies1 pies1 = new Pies1();
        pies1.szczekaj();
        pies1.imie = "Azorek";

        Pies1[] mojePsy = new Pies1[3];
        mojePsy[0] = new Pies1();
        mojePsy[1] = new Pies1();
        mojePsy[2] = pies1;

        mojePsy[0].imie = "Szarik";
        mojePsy[1].imie = "Cywil";

        System.out.println("Ostatni pies wabi się ");
        System.out.println(mojePsy[2].imie);

        int x = 0;
        while (x < mojePsy.length)
        {
            mojePsy[x].szczekaj();
            x = x + 1;
        }
    }
    public void szczekaj() {
        System.out.println(imie + " " + "szczeka: Hau, hau");
    }
}
