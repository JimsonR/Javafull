
import java.util.HashSet;

public class Secondhighest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,6,3,4,9};
        HashSet<Integer> hm = new HashSet<Integer>();
        System.out.println();
        for(int i=0; i<arr.length; i++){
            hm.add(arr[i]);
        }
        System.out.println(hm);
        System.out.println(hm.toArray()[hm.toArray().length-2]);
//        System.out.println(hm);

    }
}
