package Java1.wyklady.wyklad2;

public class wiek {
    public static void main(String[] args) {
        int wiek = (int) (Math.random()*40);
        if (wiek >= 18 )
        {
            System.out.println("Masz: "+ wiek);
            System.out.println("Jesteś pełnoletni");
            System.out.println("możesz zacząć wyrabiać prawo jazdy");
        } else {
            System.out.println("Masz: "+wiek);
            System.out.println("nie jesteś pełnoletni");
            System.out.println("nie możesz zacząć wyrabiać prawa jazdy");
            System.out.println("brakuje ci: ");

            int brakuje = 18 - wiek;
            System.out.println(brakuje + " lat.");
        }
    }
}
