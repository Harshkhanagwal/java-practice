
import java.util.HashMap;

/*
        Problem: Longest Repeating Character Replacement

        You are given a string s and an integer k.

        You can choose at most k characters in the string
        and replace them with any uppercase English letter.

        Return the length of the longest substring containing
        the same letter after performing at most k replacements.

        ------------------------------------------------------

        Example 1:
        Input:
        s = "ABAB", k = 2

        Output:
        4

        ------------------------------------------------------

        Example 2:
        Input:
        s = "AABABBA", k = 1

        Output:
        4

        ------------------------------------------------------

        Constraint:
        1 <= s.length <= 10^5

        Hint:
        Valid window condition:
        (window size - maxFreq) <= k
    */


public class CharacterReplacement {

   
    public static int characterReplacement(String s, int k) {

        // Write your code here

        HashMap<Character,  Integer> map = new HashMap<>();

        int l = 0;
        int h = 0;
        int res = 0;
        int maxFreq = Integer.MIN_VALUE;

        while(h < s.length()){

            map.merge(s.charAt(h), 1, Integer::sum);


            maxFreq = Math.max(map.get(s.charAt(h)), maxFreq);

            if( (h -l +1 ) - maxFreq > k) {
                map.merge(s.charAt(l), -1, Integer::sum);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;

            }

            if((h -l + 1) - maxFreq <= k){
                int len = h - l + 1;
                res = Math.max(len, res);
            }

            h++;


        }

        return res;
    }


    public static void runTests() {

        // Test Case 1
        String s1 = "ABAB";
        int k1 = 2;

        // Expected Output: 4
        System.out.println(characterReplacement(s1, k1));



        // Test Case 2
        String s2 = "AABABBA";
        int k2 = 1;

        // Expected Output: 4
        System.out.println(characterReplacement(s2, k2));



        // Test Case 3
        String s3 = "AAAA";
        int k3 = 2;

        // Expected Output: 4
        System.out.println(characterReplacement(s3, k3));
    }
}