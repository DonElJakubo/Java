package Java1.Cwiczenia1;

import java.util.Arrays;

public class Zadanie4 {
    public static void main(String[] args) {

        int a = (int) (Math.random()*100);
        int b = (int) (Math.random()*100);
        int c = (int) (Math.random()*100);
        int d = (int) (Math.random()*100);
        int e = (int) (Math.random()*100);

        int[] numbers = {a, b, c, d, e};
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
}
