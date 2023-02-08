package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.zadaniaDoRozmowy.zadaniaZlikowanePrzezMichala;

public class nieKolejna {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] + 1 != numbers[i + 1]) {
                System.out.println("Pierwszą niekolejną liczbą jest liczba na: " + (numbers[i]+1) + " miejscu w zbiorze");
                break;
            }
        }
    }
}
