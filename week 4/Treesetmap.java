import java.util.*;

public class Treesetmap {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("B");
        ts.add("12");
        ts.add("C");

        System.out.println(ts);

        TreeMap tm = new TreeMap();

        tm.put("11", "B");
        tm.put("222", "A");
        tm.put("c", "D");
        System.out.println(tm);
        int[] arr = {1,2,1,2,1,2,3,9,8};
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       int secmx = 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]!=arr[arr.length-1]) {
               secmx=arr[i];
           }
       }
       System.out.println(secmx);

        TreeSet<Integer> set = new TreeSet();
        Deque<Integer> deque = new ArrayDeque();
        TreeMap<Integer,Integer> hs = new TreeMap();
        int c = 0;
        for(Integer i : arr){
            set.add(i);
            deque.add(i);
            hs.put(i,c);
            c++;

        }
//        System.out.println(set.pollLast());
        System.out.println();

//    synchronized (deque){
//
//    }
    }
}
