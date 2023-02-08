package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.TworzenieWyjatkow.Przyklad;

public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            divide(a,b);
        } catch (NullPointerException e) {
            System.out.println("B nie może być null!");
        } catch (ArithmeticException e) {
            System.out.println("Nie możesz dzielić przez zero!");
        }
    }

    private static void divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Nie możesz dzielić przez zero!");
        }
        int answer = a / b;
        System.out.println("Wynik dzielenia to: " + answer);
    }
}