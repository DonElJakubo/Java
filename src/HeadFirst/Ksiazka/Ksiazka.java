package HeadFirst.Ksiazka;

public class Ksiazka {
    String tytul;
    String autor;

    static class KasiazkaTester
    {
        public static void main(String[] args) {
            Ksiazka[] mojeKsiazki = new Ksiazka[3];
            int x = 0;
            mojeKsiazki[0] = new Ksiazka();
            mojeKsiazki[1] = new Ksiazka();
            mojeKsiazki[2] = new Ksiazka();
            mojeKsiazki[0].tytul = "Czterej koderzy i Java";
            mojeKsiazki[1].tytul = "Java nocy letniej";
            mojeKsiazki[2].tytul = "Java. Receptury";
            mojeKsiazki[0].autor = "Jan Niebrzechwa";
            mojeKsiazki[1].autor = "Wilhelm Nieznany";
            mojeKsiazki[2].autor = "Ian Groźny";

            while (x < 3)
            {
                System.out.print(mojeKsiazki[x].tytul);
                System.out.print(" "+"-"+" "+"autor"+" ");
                System.out.println(mojeKsiazki[x].autor);
                x = x + 1;
            }
        }
    }
}
