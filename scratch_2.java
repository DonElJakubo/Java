
import java.util.*;
import java.io.*;

class Main {

    public static int StringChallenge(String str) {
        // code goes here
        String[] arr = str.split("-");
        String firstTime = arr[0];
        String secondTime = arr[1];

        int firstHour = Integer.parseInt(firstTime.substring(0, firstTime.indexOf(':')));
        int secondHour = Integer.parseInt(secondTime.substring(0, secondTime.indexOf(':')));

        int firstMin = Integer.parseInt(firstTime.substring(firstTime.indexOf(':') + 1, firstTime.length() - 2));
        int secondMin = Integer.parseInt(secondTime.substring(secondTime.indexOf(':') + 1, secondTime.length() - 2));

        int firstTimeMins = firstHour * 60 + firstMin;
        int secondTimeMins = secondHour * 60 + secondMin;

        if (firstTime.endsWith("pm") && firstHour != 12) {
            firstTimeMins += 12 * 60;
        }

        if (secondTime.endsWith("pm") && secondHour != 12) {
            secondTimeMins += 12 * 60;
        }

        if (firstTime.endsWith("am") && firstHour == 12) {
            firstTimeMins -= 12 * 60;
        }

        if (secondTime.endsWith("am") && secondHour == 12) {
            secondTimeMins -= 12 * 60;
        }

        int totalMins = secondTimeMins - firstTimeMins;
        if (totalMins <= 0) {
            totalMins += 24 * 60;
        }

        return totalMins;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}