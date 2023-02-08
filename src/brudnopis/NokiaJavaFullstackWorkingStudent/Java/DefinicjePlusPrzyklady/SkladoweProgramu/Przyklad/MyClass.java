package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.SkladoweProgramu.Przyklad;

// Definicja klasy
public class MyClass implements MyInterface {

    // Definicja zmiennych
    public static int var1 = 5;
    public static String var2 = "Tekst";

    // Definicja funkcji
    public static void myFunction() {
        System.out.println("Wywołanie funkcji");
    }

    // Główna funkcja programu
    public static void main(String[] args) {
        // Wyświetla tekst
        System.out.println("Witaj świecie!");
        // Wywołuje funkcję
        myFunction();
    }

    @Override
    public void doSomething() {

    }
}

