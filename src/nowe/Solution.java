package nowe;//do in java into  class nowe.Solution {
//    public int solution(String S) {
//         Implement your solution here
//    }
//}
//code : Write a function solution that, given S consisting of N characters, return the maximum number of letters "a" that can be inserted into S (including at the front and end of S), so that the resulting string doesn't contain three consecutive letter "a". If string S already contains the substring "aaa", then your function should return -1.
//        do code working with all those examples:
//        1. Given S = "aabab", the function should return 3, because a string "aabaabaa" can be made.\
//        2. Given S = "dog", the function should return 8, because a string "aadaaoaagaa" can be made.
//        3. Given S = "aa", the function should return 0, because no longer string can be made.
//        4 Given S = "baaaa", the function should return -1, because there is a substring "aaa" .

class Solution {
    public int solution(String S) {
        // Implement your solution here
        int result = 0;
        int count = 0;
        for (int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if (c == 'a'){
                count++;
                if (count == 3){
                    return -1;
                }
            } else {
                result += 2 - count;
                count = 0;
            }
        }
        result += 2 - count;
        return result;
    }
}