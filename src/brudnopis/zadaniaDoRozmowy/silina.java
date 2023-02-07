package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.zadaniaDoRozmowy;
public class silina {
        public static void main(String[] args) {
            int n = (int) (Math.random()*10);
            System.out.print(n+"!"+ " = ");
            System.out.println(silnia(n));
        }

        public static int silnia(int n) {
            if (n == 0)
                return 1;
            else
                return n * silnia(n - 1);
        }
}