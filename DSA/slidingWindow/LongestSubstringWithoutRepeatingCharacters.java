
import java.util.HashMap;


/*
Question: Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring
without repeating characters.

A substring is a contiguous sequence of characters.

Examples:

Input: s = "abcabcbb"
Output: 3
Explanation:
The longest substring is "abc".

Input: s = "bbbbb"
Output: 1
Explanation:
The longest substring is "b".

Input: s = "pwwkew"
Output: 3
Explanation:
The longest substring is "wke".

Constraints:
0 <= s.length <= 50000
s consists of English letters, digits, symbols and spaces.
*/

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        // Your code here
        int res =0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        int l =0;
        int h = 0;

        while(h < s.length()){
            map.merge(s.charAt(h), 1 ,Integer::sum);

            while(map.size() < (h - l +1)){
            map.merge(s.charAt(l), -1 ,Integer::sum);
                if(map.get(s.charAt(l))== 0) map.remove(s.charAt(l));
                l++;
            }   

            if(map.size() == (h - l +1)) {
                int len = h - l +1;
                res = Math.max(res, len);
            }
            
            h++;
        }

        
        return res;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Expected: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Expected: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Expected: 3
        System.out.println(lengthOfLongestSubstring(""));         // Expected: 0
        System.out.println(lengthOfLongestSubstring("dvdf"));     // Expected: 3
    }
}



/*

a b c b c b b

h = 0
l = 0;



*/