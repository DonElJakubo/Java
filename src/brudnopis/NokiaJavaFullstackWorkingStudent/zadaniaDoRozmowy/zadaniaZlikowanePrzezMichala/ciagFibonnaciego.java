package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.zadaniaDoRozmowy.zadaniaZlikowanePrzezMichala;

public class ciagFibonnaciego {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("Program generuje ciąg Fibonacciego: ");
        System.out.println("dal uproszczenia załóżmy że n jest liczbą 10"); //żeby pokazać że kod ciągu działa poprawnie, nie marując pamięci oraz procesora

        for (int i = 0; i <= n; i++) {
            if (i < 10) {
                System.out.print(t1 + " + "); // tutaj za t1 wyświetlamy jeszcze dodatkowy plus aby lepiej zobarazować ciąg Fibonacciego (od n=0 do n=9)
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }else{
                System.out.print(t1); // przy ostatnim n (n=10) nie dodajemy plusa na końcu ponieważ jest on niepotrzebny (bo jak wcześniej wspomniałem założyliśmy że n jest max 10)
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
    }
}