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

        int[] largeArray = {

                34, 67, 23, 89, 12, 78, 56, 45, 92, 30,
                41, 83, 27, 95, 65, 48, 37, 50, 29, 76,
                58, 39, 62, 11, 93, 70, 46, 20, 71, 33,
                18, 84, 55, 49, 31, 60, 72, 19, 77, 86,
                14, 53, 90, 24, 81, 66, 42, 13, 54, 99,
                25, 61, 88, 17, 79, 52, 43, 91, 38, 75,
                57, 68, 21, 96, 36, 82, 47, 22, 69, 40,
                94, 85, 28, 74, 32, 64, 87, 26, 59, 73,
                10, 80, 63, 44, 98, 35, 51, 15, 97, 16
                // Add more elements as needed
        };

//        System.out.println(Arrays.toString(leftArr));

//        System.out.println(Arrays.toString(rightArr));

        System.out.println(Arrays.toString(mergeSort(Arrays.stream(largeArray).asDoubleStream().toArray())));

        System.out.println(100*(5+2)+25+3-1);

    }
}
