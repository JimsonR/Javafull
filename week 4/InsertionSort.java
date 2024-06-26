import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {40,32,21,44,55,65,78,97};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <i+1; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
//                System.out.print(arr[j]+" ");
            }
//            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }
}
