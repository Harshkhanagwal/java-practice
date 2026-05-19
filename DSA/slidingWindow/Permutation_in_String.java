
import java.util.Arrays;


// Difficulty: Medium

// Problem:
// Given two strings s1 and s2, return true if s2 contains a permutation of s1.

// Example:

// s1 = "ab"
// s2 = "eidbaooo"

// Output: true

// Why?
// Because "ba" exists in s2, and "ba" is a permutation of "ab".

// Hints:

// Fixed-size sliding window
// Window size should always be s1.length()
// Use frequency counting
// Compare current window with s1

// This problem is important because it teaches:

// fixed window pattern
// frequency synchronization
// optimized hashmap/array usage


public class Permutation_in_String {

    public static boolean checkInclusion(String s1, String s2) {

        int freq[] = new int[26];
        int window[] = new int[26];
    
        for (char s : s1.toCharArray()){
            freq[s - 'a']++;
        }

        int l = 0;
        int h = 0;
        while(h < s2.length()){
            window[s2.charAt(h) - 'a']++;

            while( (h-l+1) > s1.length()){
                window[s2.charAt(l) - 'a']--;
                l++;
            }

            if(Arrays.equals(freq, window)) {
                return  true;
            }

            h++;
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean ans = checkInclusion(s1, s2);

        System.out.println(ans);
    }
}