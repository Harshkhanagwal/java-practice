package collectionFramwork;
import java.util.Collections;
import java.util.LinkedList;

public class Linklst {
    public static void main(String[] args) {

        // Create LinkedList (Dynamic doubly linked list)
        LinkedList<Integer> list = new LinkedList<>();

        // 1. Add Operation (Insert elements into list)
        list.add(10);           // adds element at end
        list.add(20);
        list.add(30);
        list.addFirst(5);       // adds at beginning
        list.addLast(40);       // adds at end
        list.add(2, 15);        // inserts at specific index
        System.out.println("After Adding: " + list);

        // 2. Get Operation (Access elements)
        System.out.println("Element at index 2: " + list.get(2)); // get by index
        System.out.println("First Element: " + list.getFirst());  // first element
        System.out.println("Last Element: " + list.getLast());    // last element

        // 3. Update Operation (Modify existing element)
        list.set(2, 50); // replaces value at index
        System.out.println("After Update: " + list);

        // 4. Remove Operation (Delete elements)
        list.remove();                    // removes first element
        list.removeFirst();               // removes first
        list.removeLast();                // removes last
        list.remove(1);                   // remove by index
        list.remove(Integer.valueOf(30)); // remove by value
        System.out.println("After Removal: " + list);

        // 5. Search Operation (Find/check elements)
        System.out.println("Contains 10? " + list.contains(10)); // check existence
        System.out.println("Index of 50: " + list.indexOf(50));  // first occurrence

        // 6. Size Operation (Number of elements)
        System.out.println("Size: " + list.size());

        // 7. Iteration (Traverse elements one by one)
        System.out.println("Iterating elements:");
        for (Integer i : list) {
            System.out.println(i);
        }

        // Create another list for advanced operations
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(200);

        // 8. addAll() (Add all elements of another collection)
        list.addAll(list2);
        System.out.println("After addAll: " + list);

        // 9. addAll(index) (Insert collection at specific position)
        list.addAll(1, list2);
        System.out.println("After addAll at index: " + list);

        // 10. isEmpty() (Check if list is empty)
        System.out.println("Is list empty? " + list.isEmpty());

        // 11. sort() (Sort elements in ascending order)
        Collections.sort(list);
        System.out.println("After Sorting: " + list);

        // 12. reverse() (Reverse elements order)
        Collections.reverse(list);
        System.out.println("After Reversing: " + list);

        // 13. subList() (Get portion of list)
        System.out.println("SubList (0 to 2): " + list.subList(0, 2));

        // 14. retainAll() (Keep only common elements)
        list.retainAll(list2);
        System.out.println("After retainAll: " + list);

        // Refill list
        list.add(300);
        list.add(400);

        // 15. removeAll() (Remove all matching elements from another list)
        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        // 16. equals() (Compare two lists)
        System.out.println("list equals list2? " + list.equals(list2));

        // 17. toArray() (Convert list to array)
        Object[] arr = list.toArray();
        System.out.println("Array elements:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // 18. clear() (Remove all elements)
        list.clear();
        System.out.println("After Clear: " + list);

        // 19. Queue Operations (FIFO behavior)
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Peek (view head): " + list.peek()); // view first element
        System.out.println("Poll (remove head): " + list.poll()); // remove first element
        System.out.println("After Poll: " + list);

        // 20. Stack Operations (LIFO behavior)
        list.push(5); // insert at top
        System.out.println("After Push: " + list);
        System.out.println("Pop (remove top): " + list.pop()); // remove top element
        System.out.println("After Pop: " + list);
    }
}