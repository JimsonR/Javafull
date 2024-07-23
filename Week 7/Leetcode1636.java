import java.util.*;
import java.util.stream.Stream;

public class Leetcode1636 {
    public static void main(String[] args) {
        Integer[] arr = {1,1,2,2,2,3};
        HashMap<Integer,Integer> freq = new HashMap<>();


        for(int i = 0; i< arr.length;i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 0);
            }
        }

        Stream<Integer> integerStream = Arrays.stream(arr);
//        System.out.println  ( Arrays.toString(integerStream.sorted((a,b)->freq.get(a) != freq.get(b)?freq.get(a)-freq.get(b):b-a).mapToInt(n->n).toArray()));
        Arrays.stream(arr).sorted((a,b)->freq.get(a)!=freq.get(b)?freq.get(a)-freq.get(b):b-a ).mapToInt(n->n);

        int n=5;
        int k = 2;
k--;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=5 ; i++) {
            list.add(i);
        }
        System.out.println(list);
        int index = 0;
        int start = 0;
        while(list.size()!=1){


           start = ((start+k)%(list.size()));

            System.out.println(list.remove(start));
        }
        System.out.println(list);
        System.out.println(50 * (10 + 7) + 4 + 75);




    }
}
