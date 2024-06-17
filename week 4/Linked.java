import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Linked {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list.get(0));
        list.remove(0);
        list.add(0);
        list.add(0,1);

        System.out.println(list.get(0)); // Linkedlists requires traversing from head node to the desired index, which takes linear time
        list.add(0,2); // At the beginning : O(1)
        list.add(3);//At the end : O(1)
        list.add(1, 4); // Adding in the middle requires traversal to the insertion point which is O(n)
        list.remove(0); // At the beginning  : O(1)
//        System.out.println(list);
        list.remove(12);// At the end for the singly linked list: O(1)
        list.remove(2); // Removing an element from the middle requires traversal requiring traversal: O(n)

        System.out.println(list.get(0)); // Like Arraylists , linkedlists requires to scan to find an element, resulting in : O(n)

 //        Iterator iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
