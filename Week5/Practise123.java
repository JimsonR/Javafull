import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practise123 {
    public static void main(String[] args) {
        int[] arr = {1,3,21,23,1,3123,4};
        int target = 23;
        HashMap<Integer, ArrayList> hm = new HashMap();
//        System.out.println(Arrays.binarySearch(arr,target));
//        for(int i = arr.length-1;i>=0;i--){
//            System.out.printf("%d\t%d \n",arr[i],i);
//            System.out.println(arr[arr.length-1-i]+" "+ (arr.length-i-1));
//            System.out.println(arr[i]);
//        }

        for(int i = 0; i< arr.length;i++){
            ArrayList list = new ArrayList();
            if (hm.containsKey(arr[i])){

//                hm.put(arr[i], hm.);
            }
            else {
                hm.put(arr[i],list);
            }
            }
        System.out.println(hm);
//        System.out.println(hm.get(target));


    }
}
