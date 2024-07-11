import java.lang.reflect.Array;
import java.util.Arrays;

public class NumbersSubbu {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};

//        for(int i = 0; i < arr.length; i++){
//            System.out.println(Arrays.toString(arr));
//            for(int j = 1; j < arr.length; j++){
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
//
//            }
//
//
//        }
        for (int i = 0 ; i < 5 ;i++){
            for(int j = 0 ; j <= 5 ; j++){
                System.out.print((j+i)%(6) + " ");

            }
            System.out.println();
        }


    }
}
