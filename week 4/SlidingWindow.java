import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int [] arr ={1,3,-1,-3,5,3,6,7,8};
        ArrayList<Integer> list = new ArrayList<>();

        int sum = arr[0]+arr[1]+arr[2];
        list.add(sum);
        int max = sum;
        for(int i=3;i<arr.length;i++) {

            sum += arr[i] - arr[i-3];
            list.add(sum);
//            if(sum>max){
//                max = sum;
//            }
        }
//        System.out.println(max);
        System.out.println(list);

        int[] arr1 = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> list1 = new ArrayList<>();
        sum = arr1[0]+arr1[1]+arr1[2]+arr1[3];
        list1.add(sum);

        for(int i=4;i<arr1.length;i++) {
            sum += arr1[i]-arr1[i-4];
            list1.add(sum);
        }
        System.out.println(list1);

    }
}
