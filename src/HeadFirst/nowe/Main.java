package HeadFirst.nowe;

public class Main {
    public static void main(String[] args)
    {
        int x=1;
        System.out.println("Przed wykonaniem pętli");
        while (x<4) {
            System.out.println("wewnątrz pętli");
            System.out.println("Wartość x = " + x);
            x=x+1;
        }
        System.out.println("I juz po pętli...");
    }
}