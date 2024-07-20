import java.util.Arrays;

public class BInsch {
    static public int recurbinsrch(int[] arr, int target, int left, int right) {
//    int left = 0;
//    int right = arr.length;
//    int left1 = 0;
//    int right1 = arr.length-1;
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                return recurbinsrch(arr, target, left, mid);
            } else {
                return recurbinsrch(arr, target, mid + 1, right);
            }
        }

        return -1;

}
     static int[] mergeSort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid = arr.length/2;
        int [] leftArr = Arrays.copyOfRange(arr,0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid , arr.length);

        int[] leftSortedArr = mergeSort(leftArr);
        int[] rightSortedArr = mergeSort(rightArr);

        return merge(leftSortedArr , rightSortedArr);
        }
      static   int[] merge(int[] leftArr, int[] rightArr){
//          System.out.println(leftArr.length);
        int[] result = new int[leftArr.length+rightArr.length];
        int i = 0, j = 0, k = 0;

        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i]< rightArr[j]){
                result[k++] = leftArr[i++];
            }
            else{
                result[k++] = rightArr[j++];
            }

        }

        while(i<leftArr.length){
            result[k++] = leftArr[i++];
        }
        while(j<rightArr.length){
            result[k++] = rightArr[j++];
        }

        return result;

        }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
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
        int target = 89;
        System.out.println(Arrays.toString(mergeSort(largeArray)));


        System.out.println(recurbinsrch(mergeSort(largeArray), target, 0,largeArray.length-1));
    }
}
