import java.util.Arrays;
import java.util.HashMap;

public class Binarysrch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,45,2,3,24,23,423,543,5,324,423,4,234,23,423,4,23,42,34,23,423,4,234,233,42,34,6,54,645,6546,34354,523,42,34,23,423,4};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int target = 34354;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
            }
            else {
                hm.put(arr[i], i);
            }
        }
//        System.out.println(hm);

            if(hm.containsKey(target)){
//                System.out.println(hm.get(target));
            }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }

            }

        }
    System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid =(left+right)/2;
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
            else if (arr[mid] < target) {
                left = mid+1;
            }

        }
    }
}
