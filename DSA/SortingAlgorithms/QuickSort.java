package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        /*
        quickSort = moves smaller elements to left of pivot.
                    recursively divide array in 2 partitions

        run-time complexity = Best case O(n log(n))
                              Average case O(n log(n))
                              Worst case O(n^2) if already sorted

        space complexity = O(log(n))
         */



        int[] array = {8,3,2,1,4,6,7,9,5};

        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start){
            return;
        }

        System.out.println(Arrays.toString(array));

        int pivot = partition(array, start,end);
        quickSort(array,start, pivot-1);
        quickSort(array, pivot+1,end);


    }
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start -1;

        for(int j = start; j <= end-1 ; j++){
            if(array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;


        return i;
    }
}
