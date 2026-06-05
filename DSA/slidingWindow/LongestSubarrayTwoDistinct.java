
import java.util.HashMap;

/*
Question: Longest Subarray With At Most Two Distinct Integers

Given an integer array nums, return the length of the longest
contiguous subarray that contains at most 2 distinct integers.

A distinct integer is a unique value.

Examples:

Input: nums = [1,2,1]
Output: 3
Explanation:
The entire array contains only 2 distinct integers {1,2}.

Input: nums = [0,1,2,2]
Output: 3
Explanation:
The longest valid subarray is [1,2,2].

Input: nums = [1,2,3,2,2]
Output: 4
Explanation:
The longest valid subarray is [2,3,2,2].

Constraints:
1 <= nums.length <= 100000
0 <= nums[i] <= 100000
*/

public class LongestSubarrayTwoDistinct {

    public static int longestSubarrayTwoDistinct(int[] nums) {

        // Your logic here


        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int h = 0;

        while(h < nums.length){
            map.merge(nums[h], 1, Integer::sum);

            while(map.size() > 2){
            map.merge(nums[l], -1, Integer::sum);
                    
            if(map.get(nums[l]) == 0) map.remove(nums[l]);
            l++;
        }

            int len = h - l + 1;
            res = Math.max(len, res);

        h++;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 1 };
        System.out.println(longestSubarrayTwoDistinct(nums1)); // Expected: 3

        int[] nums2 = { 0, 1, 2, 2 };
        System.out.println(longestSubarrayTwoDistinct(nums2)); // Expected: 3

        int[] nums3 = { 1, 2, 3, 2, 2 };
        System.out.println(longestSubarrayTwoDistinct(nums3)); // Expected: 4

        int[] nums4 = { 1, 2, 1, 3, 4, 3, 5, 1, 2 };
        System.out.println(longestSubarrayTwoDistinct(nums4)); // Expected: 3
    }
}