package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.Java.DefinicjePlusPrzyklady.Upraszczanie.Przyklad;
// Na przyklad można użyć programu:
public class Program1 {
    public static void main(String[] args) {
        int x = 5;
        int y = x + (x == 0 ? 5 : 10);
        System.out.println(y);

        String name = "John";
        String userName = name != null ? name : "Guest";
        System.out.println(userName);
    }
}
