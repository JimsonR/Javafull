import java.util.*;

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
//            ArrayList list = new ArrayList();
//            list.add(i);
            if (hm.containsKey(arr[i])){
               hm.get(arr[i]).add(i);
//                hm.put(arr[i], hm.);
            }
            else {
                hm.put(arr[i],new ArrayList());
                hm.get(arr[i]).add(i);
            }
            }
//        System.out.println(hm);
        for(Map.Entry<Integer,ArrayList> s: hm.entrySet()){
            System.out.println(s);

        }
//        Iterator itr = hm.entrySet().iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println(hm.get(target));


    }
}
