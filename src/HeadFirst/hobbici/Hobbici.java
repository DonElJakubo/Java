package HeadFirst.hobbici;

public class Hobbici {
    String imie;

    public static void main(String[] args) {

        Hobbici[] h = new Hobbici[3];
        int z = -1;

        while (z < 2)
        {
            z = z + 1;
            h[z] = new Hobbici();
            h[z].imie = "Bilbo";
            if (z == 1)
            {
                h[z].imie = "Frodo";
            }
            if (z == 2)
            {
                h[z].imie = "Sam";
            }
            System.out.print(h[z].imie + " " + "-" + " " + "jest" + " ");
            System.out.println("dobrym imieniem dla Hobbita");
        }
    }
}
