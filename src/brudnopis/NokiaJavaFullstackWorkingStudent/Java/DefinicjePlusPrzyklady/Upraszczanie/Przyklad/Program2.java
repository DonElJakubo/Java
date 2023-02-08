package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.Upraszczanie.Przyklad;

// Zamiast rozpisywać go w ten sposób:
public class Program2 {
    public static void main(String[] args) {
        int x = 5;
        int y;
        if (x == 0) {
            y = x + 5;
        } else {
            y = x + 10;
        }
        System.out.println(y);


        String name = null;
        String userName = "";

        if (name != null) {
            userName = name;
        } else {
            userName = "Guest";
        }
        System.out.println(userName);
    }
}
