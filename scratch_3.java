
//Solution
import java.util.*;
import java.io.*;

class Main {

    public static int ArrayChallenge(int[] arr) {
        // code goes here
        int maxProfit = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int profit = arr[j] - arr[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(s.nextLine()));
    }

}