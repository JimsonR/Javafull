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
    }
}
