import java.util.Arrays;

public class Mymergepract {
  static double [] arr = {3, 7, 6, -10, 15, 23.5, 55, -13};
    static double[] mergeSort(double[] arr){
       if(arr.length <= 1){
           return arr;
       }
        int mid = arr.length/2;
//        System.out.println(Arrays.toString(arr));
        double[] left = Arrays.copyOfRange(arr,0, mid);
        double[] right = Arrays.copyOfRange(arr, mid, arr.length);

        double[] sortedLeft = mergeSort(left);
        double[] sortedRight = mergeSort(right);
        System.out.println(Arrays.toString(sortedRight));
        return merge(sortedLeft,sortedRight);
    }

  static double[] merge(double[] left, double[] right){
         double[] result = new double[left.length+right.length];
         int i = 0 , j = 0, k = 0;
         while(i<left.length && j < right.length){
             if(left[i]<right[j]){

                result[k++] = left[i++];

             }
             else{
                 result[k++] = right[j++];
             }

         }
         while (i<left.length){
             result[k++] = left[i++];
         }
         while (j<right.length){
             result[k++] = right[j++];
         }
         return  result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
