
class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int min = 1;
        boolean[] seen = new boolean[N + 1];
        for (int i : A) {
            if (i > 0 && i <= N) {
                seen[i] = true;
            }
        }
        while (min <= N && seen[min]) {
            min++;
        }
        return min;
    }
}
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//Solution: