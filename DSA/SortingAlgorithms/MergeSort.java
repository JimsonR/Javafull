package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    static long[] mergeSort(long[] arr){
        if(arr.length<=1){
            return arr;
        }
//        System.out.println(Arrays.toString(arr));
        int mid = arr.length/2;
        long [] leftArr =  Arrays.copyOfRange(arr, 0, mid);
        long [] rightArr = Arrays.copyOfRange(arr,mid, arr.length);
        long[] sortedLeft = mergeSort(leftArr);
        long[]  sortedRight = mergeSort(rightArr);


        return merge(sortedLeft,sortedRight);
    }
    static long[] merge(long[] leftArr, long[] rightArr){

        long[] result = new long[leftArr.length+rightArr.length];

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

//        double [] arr = {3, 7, 6, -10, 15, 23.5, 55, -13};

        long[] largeArray = {

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
//        String s = "abcde";
//
//        String s3 = "bcd";
//
//        System.out.println(s);
////      String s3 =   String.join("",s2);
////        System.out.println(s3);
//        StringBuilder s4 = new StringBuilder(s);
//        System.out.println( s.contains(s3));
//
////        System.out.println(Arrays.toString(leftArr));
//
////        System.out.println(Arrays.toString(rightArr));
//
//

//        System.out.println(Arrays.toString(mergeSort(Arrays.stream(largeArray).asDoubleStream().toArray())));
        System.out.println(Arrays.toString(mergeSort(largeArray)));


    }
}
