import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> ilist = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        System.out.println(list.get(0)); // Accessing arralist elements : O(1)

        list.add("D"); // Adding element at the end: O(1)
        list.add(0, "AA"); // Adding element at beginning or in the middle : O(n)
        list.remove(0); // Removing element at beginning or in the middle : O(n) And if we remove last element : O(1)

        System.out.println(list.indexOf("AA")); // Searching for an element requires to linear scan in the worst case, arraylists do not maintain any
        //order or indexing beyond their indices

//        TreeSet<Str>
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        System.out.println();
        ArrayList<Integer> unsort = new ArrayList<Integer>();
        unsort.add(65);
        unsort.add(1);
        unsort.add(23);

        unsort.add(45);
        Collections.sort(unsort);
        System.out.println(unsort);
    }
}