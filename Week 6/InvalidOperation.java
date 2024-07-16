import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

class InvalidOperationException extends Exception{
    InvalidOperationException(String s){
        super(s);
    }
}
public class InvalidOperation {
    static void divide(int numerator , int denominator)throws InvalidOperationException{
        if(denominator == 0) {
            throw new InvalidOperationException("Denominator cannot be zero");
        }
        int c = numerator/denominator;
//        System.out.println(c);

    }
    static void mchain(){

    }
    static int mchain(int i){
        mchain();
        return 1;
    }



    public static void main(String[] args) {

        try {
            divide(0,9);
         }catch (InvalidOperationException e){
        e.printStackTrace();
         }
        int[] arr1 = {1, 3, 5}; int[] arr2 = {2, 4, 6};
        int[] result = new int[arr1.length+arr2.length];
        int pos1 = 0;

        int pos2 = 1;

//        while(pos1 < arr1.length){
//            System.out.println(arr1[pos1]);
//            if(pos2%arr2.length == 0){
//                pos1++;
//            }
//
//
//
//            pos2++;
//
//        }
        OptionalInt optionalInt = OptionalInt.of(2);
        System.out.println(optionalInt.isPresent());

        String[] arr = {"a", "b", "a", "c", "a","c","c","c"};
       ConcurrentSkipListMap<String,Integer> hashMap = new ConcurrentSkipListMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i],1);
            }

        }
        System.out.println(hashMap);
        String mode = arr[0];
        for(Map.Entry<String,Integer> maps: hashMap.entrySet()){
            if(hashMap.get(mode)< maps.getValue()){
               mode = maps.getKey();
            }
        }
        System.out.println(mode);

//        ConcurrentSkipListMap<>
    }
}
