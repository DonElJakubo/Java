import java.util.*;
import java.io.*;
//a program that describes how many numbers there are in a written sequence of numbers for example in 223344 output 222324
class Main {

    public static String StringChallenge(String str) {
        // code goes here
        char prev = str.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                sb.append(count + "" + prev);
                prev = curr;
                count = 1;
            }
        }
        sb.append(count + "" + prev);
        return sb.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}