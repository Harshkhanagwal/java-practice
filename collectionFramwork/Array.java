package collectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        // Array list
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(20);
        lst.add(23);
        lst.add(30);
        lst.add(69);

        System.out.println(lst.size());

        System.out.println(lst);
        lst.remove(1);
        System.out.println(lst);

        List<Integer> lst2 = new ArrayList<>();

        lst2.add(50);
        lst2.add(80);
        lst2.add(9);
        lst2.add(11);

        lst.addAll(lst2);

        System.out.println(lst);

        lst2.clear();
        System.out.println("lst 2 : " + lst2);

        // intrator
        Iterator<Integer> itrtor = lst.iterator();

        // while(itrtor.hasNext()){
        // System.out.println("Element : " +itrtor.next());
        // }

        lst2.add(50);
        lst2.add(80);
        lst2.add(9);
        lst2.add(11);

        System.out.println("lst 2 : " + lst2);

        lst2.set(0, 100);

        System.out.println("lst 2 2nd elm replaced with 100 :" + lst2);

        List<Integer> lst3 = new ArrayList<>();
        lst3.addAll(lst);

        Object[] arr = lst3.toArray();

        // for(Object obj:arr){
        // System.out.println(obj);
        // }

        // System.out.println(lst3.contains(100));

        // sort array list, element)
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println(lst);

        ArrayList<Integer> newLst = (ArrayList<Integer>) lst.clone();
        System.out.println(newLst);
    }
}