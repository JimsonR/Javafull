import java.sql.Struct;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Cons{
   public Cons(){
        System.out.println("Constructor pract");
    }
    protected class Struct{
      Struct(){
           System.out.println("Struct pract");

       }
    }

}
public class Constructorpract {
    static void m1(){
        System.out.println("m1");
    }
    public static void main(String[] args) {
        m1();
        Cons c = new Cons();
        Cons.Struct ls = c.new Struct();

//        int[] arr = {1,0,2,0,3,0,4,5,0};
//        int[] c = new int[arr.length];
////        System.out.println(Arrays.toString(c));
//
//
//
//
//
//        int count=0;
//        for (int i = 0; i< arr.length; i++) {
//            if (arr[i]!=0) {
//                c[count] = arr[i];
//                count++;
//            }
//
//        }
//        System.out.println(Arrays.toString(c));


//        for (int i = 0; i < arr.length-1; i++) {
//                for (int j = i+1; j < arr.length; j++) {
//                    if (arr[j-1] == 0) {
//                        int temp = arr[j];
//                        arr[j] = arr[j-1];
//                        arr[j-1] = temp;
//                    }
//
//                }
//
//                }

//        System.out.println(Arrays.toString(arr));

        
    }
}
