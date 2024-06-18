import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {28, 3, 4, 3, 2, 323, 234, 4, 532, 23, 4, 343, 2, 35, 45, 4, 34, 23, 432, 3432, 5, 4, 2, 34, 34, 32};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
