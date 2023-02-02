package Zgadywanka;



public class Zgadywanka {
    Gracz p1;
    Gracz p2;
    Gracz p3;

    public void rozpocznijGre() {


        p1 = new Gracz();
        p2 = new Gracz();
        p3 = new Gracz();

        int typp1 = 0;
        int typp2 = 0;
        int typp3 = 0;

        boolean p1odgadl = false;
        boolean p2odgadl = false;
        boolean p3odgadl = false;

        int liczbaOdgadywana = (int) (Math.random()*100);
        System.out.println("Myślę o liczbie z zakresu od 0 do 100");

        while(true)
        {
            System.out.println("Należy wytypować liczbę: "+ liczbaOdgadywana);
            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();

            typp1 =p1.liczba;
            System.out.println("Gracz pierwszy wytypował liczbę: "+typp1);

            typp2 =p2.liczba;
            System.out.println("Gracz drugi wytypował liczbę: "+typp2);

            typp3 =p3.liczba;
            System.out.println("Gracz trzeci wytypował liczbę: "+typp3);

            if (typp1 == liczbaOdgadywana)
            {
                p1odgadl = true;
            }
            if (typp2 == liczbaOdgadywana)
            {
                p2odgadl = true;
            }
            if (typp3 == liczbaOdgadywana)
            {
                p3odgadl = true;
            }
            if (p1odgadl || p2odgadl || p3odgadl)
            {
                System.out.println("Mamy zwycięzcę!");
                System.out.println("Czy gracz pierwszy wytypował poprawnie ? "+p1odgadl);
                System.out.println("Czy gracz drugi wytypował poprawnie ? "+p2odgadl);
                System.out.println("Czy gracz trzeci wytypował poprawnie ? "+p3odgadl);
                System.out.println("Konie gry.");
                break;
            } else {
                System.out.println("Gracze będą musieli spróbować ponownie.");

            }

        }
    }
}
