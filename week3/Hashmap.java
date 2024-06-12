import java.util.HashMap;
import java.util.Hashtable;

public class Hashmap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,8,9,9};
        Hashtable hashtable = new Hashtable();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(i,arr[i]);
            hashtable.put(arr[i],i);
        }
        System.out.println(hashtable);
        System.out.println(hm);
    }
}
