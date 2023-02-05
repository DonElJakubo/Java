package HeadFirst.drugie.nowe;//Digital clock displays current time using the format "HH:MM:SS" where:
//        - "HH" is the hour of the day (00 through 23), as two decimal digits;
//        - "MM" is the minute wiyhin the hour (00 through 59), as two decimal digits;
//        - "SS" is the second within the minute (00 through 59), as two decimal digits;
//        Note that hour, minure and second are always represented as two digits, so the clock display leading zeros if needed.
//        We say that a point in time is interesting if digital clock needs at most two distinct digits to display it. For example, 13:31:33 and 02:20:22 are both interesting, because gigital clock can display it usind only 1 and 3 in the first case, or 0 and 2 in the second one. 00:00:00 is interesting too, as it can be display it using only 0, but 15:45:14 is not, due to the factthat more than two distinct digits are used.
//        Note that delimiter character ":" is permantently printed onto clock's display and doesn't count as one of displayed digits.
//        Your task is to count points in time in a given period of time.
//        Write a function:
//class HeadFirst.drugie.nowe.Solution {
//    public int solution(String S, String T);
//}
//that, given strings S and T representing time in format "HH:MM:SS", returns the number of interesting points in time between S and T (inclusive).
//        Write code which works with those examples: given "15:15:00" and "15:15:12", your function should return 1, because there is only one interesting point in time between these points (namely 15:15:11), Given"22:22:21" and "22:22:23", your function should return 3; interesting points un time are "22:22:21", "22:22:22", and "22:22:23".
//        Assume that:
//        - string S and T follow the format "HH:MM:SS" strictly;
//        - string S describes a point in time before T on the same day.
//
//        In your solution, focus on correctness.
//        The preformance of your solution will not be the focus of the assessment.
//
//        HeadFirst.drugie.nowe.Solution:
        import java.util.HashSet;

class Solution2 {
    public int solution(String S, String T) {
        int count = 0;
        String[] startTime = S.split(":");
        String[] endTime = T.split(":");
        int startHour = Integer.parseInt(startTime[0]);
        int startMinute = Integer.parseInt(startTime[1]);
        int startSecond = Integer.parseInt(startTime[2]);
        int endHour = Integer.parseInt(endTime[0]);
        int endMinute = Integer.parseInt(endTime[1]);
        int endSecond = Integer.parseInt(endTime[2]);

        for (int hour = startHour; hour <= endHour; hour++) {
            for (int minute = startMinute; minute <= endMinute; minute++) {
                for (int second = startSecond; second <= endSecond; second++) {
                    HashSet<Integer> set = new HashSet<>();
                    set.add(hour/10);
                    set.add(hour%10);
                    set.add(minute/10);
                    set.add(minute%10);
                    set.add(second/10);
                    set.add(second%10);

                    if (set.size() <= 2) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}