package nowe;

public class PiosenkaOPiwie {
    public static void main(String[] args)
    {
        int iloscButelek = 100;
        String slowo = "bottles";
        while (iloscButelek > 0 )
        {
            if (iloscButelek ==1) {
                slowo = "bottle";
            }
            System.out.println(iloscButelek + " " + slowo + " of beer ont the wall" );
            System.out.println(iloscButelek + " " + slowo + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it arount.");
            iloscButelek = iloscButelek - 1;
            if (iloscButelek > 0) {
                System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
            } else {
                System.out.println("No more" + " " + slowo + " " + "of beer on the wall" );
                System.out.println("We can't take anything and pass it around");
            }
        }
    }
}
