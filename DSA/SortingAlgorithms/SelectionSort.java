package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {28, 3, 4, 6, 5,2,4,3,21,23};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
//                System.out.print(arr[j] + " ");
                if (arr[min] > arr[j]) {
                    min = j;

                }

                }
//            System.out.println(min);
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            System.out.println();

            }
        System.out.println(Arrays.toString(arr));
        }

}
