import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort {
    static double[] mergeSort(double[] arr){
        if(arr.length<=1){
            return arr;
        }
        System.out.println(Arrays.toString(arr));
        int mid = arr.length/2;
        double [] leftArr =  Arrays.copyOfRange(arr, 0, mid);
        double [] rightArr = Arrays.copyOfRange(arr,mid, arr.length);
        double[] sortedLeft = mergeSort(leftArr);
        double[]  sortedRight = mergeSort(rightArr);


        return merge(sortedLeft,sortedRight);
    }
    static double[] merge(double[] leftArr, double[] rightArr){

        double[]  result = new double[leftArr.length+rightArr.length];

        int i =0 ,
                j =0 ,
                    k = 0;

        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i]<rightArr[j]){
                result[k++] = leftArr[i++];
            }
            else{
                result[k++] = rightArr[j++];
            }
        }
        while(i< leftArr.length){
            result[k++] = leftArr[i++];
        }
        while(j< rightArr.length){
            result[k++] = rightArr[j++];
        }

        return result;
    }
    public static void main(String[] args) {

        double [] arr = {3, 7, 6, -10, 15, 23.5, 55, -13};



//        System.out.println(Arrays.toString(leftArr));
//        System.out.println(Arrays.toString(rightArr));
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
