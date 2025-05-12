import java.util.Arrays;

public class MyQsort {

    public static void quickSort(int[] array, int start, int end){
        if(end <= start){
            return;
        }
        int pivot = partition(array,start,end);


        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,end);

    }
    public static int partition(int[] array, int start, int end){

        int pivot = array[end];
        int i = start-1;

        for (int j = start; j <= end-1; j++) {
            if(array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }


        }
        i++;
        int temp = array[end];
        array[end] = array[i];
        array[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int[] arr = {44,43,53,45,54,3,45,32,4,234,23,23,2,3,23,42,34};

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
