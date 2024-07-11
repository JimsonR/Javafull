import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,8,9,9};
        Hashtable hashtable = new Hashtable();
        Vector v = new Vector();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(i,arr[i]);
            v.add(arr[i]);
            hashtable.put(arr[i],i);
        }
        
//        System.out.println(hashtable);
//        System.out.println(hm);
        System.out.println(v);
//        Set<Integer> set = Collections.synchronizedSet();
        Map m = Collections.synchronizedMap(hm);
        for (Map.Entry i : hm.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }


        System.out.println(m);
    }
}
