package basics.Arraylst;

import java.util.*;

public class Main {

    // 1. Sum of Elements
    public static int sumOfelm(ArrayList<Integer> lst) {
        int sum = 0;

        for (int elm : lst) {
            sum += elm;
        }
        return sum;
    }

    // 2. Find Maximum Element
    public static int fMax(ArrayList<Integer> lst) {
        int max = lst.get(0);

        for (int n : lst) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    // 3. Count Even Numbers
    public static int countEven(ArrayList<Integer> lst) {
        int count = 0;

        for (int n : lst) {
            if (n % 2 == 0)
                count++;
        }

        return count;
    }

    // 4. Reverse the List
    public static ArrayList<Integer> reverse(ArrayList<Integer> lst) {

        ArrayList<Integer> rLst = new ArrayList<>();

        rLst.addAll(lst);
        Collections.reverse(rLst);

        return rLst;
    }

    // 5. Remove Duplicates
    public static ArrayList<Integer> rDublicate(ArrayList<Integer> lst) {

        return new ArrayList<>(new LinkedHashSet<>(lst));
    }

    // 6. Second Largest Element
    public static int secLarg(ArrayList<Integer> lst) {
        ArrayList<Integer> nLst = new ArrayList<>();

        nLst.addAll(lst);

        Collections.sort(nLst);

        return nLst.get(nLst.size() - 2);
    }

    // 7. Frequency of Elements
    public static HashMap<Integer, Integer> elmFrequency(ArrayList<Integer> lst) {

        HashMap<Integer, Integer> nHashMap = new HashMap<>();

        for (int n : lst) {
            nHashMap.put(n, nHashMap.getOrDefault(n, 0) + 1);
        }

        return nHashMap;
    }

    // 8. Rotate List
    public static ArrayList<Integer> kRotate(ArrayList<Integer> lst, int k) {

        ArrayList<Integer> nLst = new ArrayList<>();

        nLst.addAll(lst);

        Collections.reverse(nLst);
        Collections.reverse(nLst.subList(0, k));
        Collections.reverse(nLst.subList(k, nLst.size()));
        return nLst;
    }

    // 9. Merge Two ArrayLists
    public static ArrayList<Integer> merge(ArrayList<Integer> lst, ArrayList<Integer> lst2) {
        ArrayList<Integer> nLst = new ArrayList<>();

        nLst.addAll(lst);
        nLst.addAll(lst2);

        return nLst;
    }

    // 10. Check if Sorted
    public static boolean sortedornot(ArrayList<Integer> lst) {

        ArrayList<Integer> nLst = new ArrayList<>();
        nLst.addAll(lst);

        Collections.sort(nLst);

        return lst.equals(nLst);
    }

    // 11. Remove All Occurrences
    public static ArrayList<Integer> removeOccurrence(ArrayList<Integer> lst, int n) {

        ArrayList<Integer> nLst = new ArrayList<>();
        nLst.addAll(lst);

        nLst.removeIf(x -> x == n);

        return nLst;
    }

    // 12. Find Missing Number
    public static int missing(ArrayList<Integer> lst) {
        int n = Collections.max(lst);

        int expectedSum = n * (n + 1) / 2;

        int sum = 0;
        for (int elm : lst) {
            sum += elm;
        }

        System.out.println(expectedSum + " " + sum);

        return expectedSum - sum;
    }

    // 13. Pair Sum Problem
    public static int[] pairSum(ArrayList<Integer> list, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int complement = target - current;

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(current, i);
        }

        return new int[] { -1, -1 };
    }

    // 14. Find Intersection of Two Lists
    public static ArrayList<Integer> intersection(ArrayList<Integer> lst, ArrayList<Integer> lst2) {
        ArrayList<Integer> result = new ArrayList<>();

         HashSet<Integer> set = new HashSet<>();

         set.addAll(lst);

         for(int elm:lst2) {
            if (set.contains(elm)) result.add(elm);
         }

        return result;
    }


    // // 15. Longest Increasing Subsequence

    // public static int longestSubsequence(ArrayList<Integer> lst){
    //     ArrayList<Integer> result = new ArrayList<>();

    //     result.add(lst.get(0));


    //     for(int elm: lst.subList(1, lst.size()-1)) {
            
    //         if(result.get(result.size() -1) > elm ) {
                
    //             result.add(elm);
    //             System.out.println(result);
    //             System.out.println(elm);
    //         }

    //     }

    //      System.out.println(result);

    //     return result.size();
    // }

    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(20);
        lst.add(44);
        lst.add(43);
        lst.add(17);
        lst.add(93);
        lst.add(56);
        lst.add(44);
        lst.add(17);
        lst.add(93);
        lst.add(999);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("original list : " + lst);
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // sum of elements
        System.out.println("Sum of akk element in list : " + sumOfelm(lst));

        // biggest elem in list
        System.out.println("Maximum Element in list : " + fMax(lst));

        // count even
        System.out.println("Count of Even No. : " + countEven(lst));

        // 4. Reverse the List
        System.out.println("Reverse List. : " + reverse(lst));

        // remove douplicate
        System.out.println("Unique elements from the list : " + rDublicate(lst));

        // 2nd largest element of list
        System.out.println("2nd largest element of the list. : " + secLarg(lst));

        // Frequency of Elements
        System.out.println("Frequency of Elements : " + elmFrequency(lst));

        // rotate list with K elm ;
        System.out.println("rotate list with K elm : " + kRotate(lst, 2));

        // merge 2 lsts
        System.out.println("Merge two list : " + merge(lst, new ArrayList<>(Arrays.asList(12, 15, 24, 75))));

        // Check if Sorted
        System.out.println("sorted : " + sortedornot(lst));

        // remove Occurenc
        System.out.println("sorted : " + removeOccurrence(lst, 93));

        ArrayList<Integer> lst2 = new ArrayList<>();

        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);
        lst2.add(6);
        lst2.add(7);

        // Find Missing Number
        System.out.println("Missing from lst : " + missing(lst2));

        // 13. Pair Sum Problem
        System.out.println("Index of Pair sum : " + Arrays.toString(pairSum(lst2, 5)));

        // 14. Find Intersection of Two Lists
            ArrayList<Integer> lst3 = new ArrayList<>();
            lst3.add(1);
            lst3.add(2);
            lst3.add(2);
            lst3.add(5);
            lst3.add(8);

            ArrayList<Integer> lst4 = new ArrayList<>();
            lst4.add(6);
            lst4.add(2);
            lst4.add(2);
            lst4.add(5);
            lst4.add(0);

            System.out.println("Intersection of lst3 and lst4 : "+intersection(lst3, lst4));

        // 15. Longest increasing subSequence
        // System.out.println("Longest increasing subSequence : "+ longestSubsequence(new ArrayList<>(Arrays.asList(1, 9, 2, 5, 3, 7, 101, 18))));
        System.out.println();
    }
}
