import java.util.Arrays;
import java.util.HashMap;

public class Jimmasasd {
    public static void main(String[] args) {
        int [] nums ={8,1,2,2,3};
//        Output: [4,0,1,1,3]
        HashMap<Integer,Integer> hashMap= new HashMap<>();
//        Arrays.sort(nums);
        int[] res = new int[nums.length];
        System.out.println(Arrays.toString(nums));
//        for(int i =0; i<nums.length;i++){
//
//
//            System.out.println(nums.length-i-1);
//
//        }



//        for(int i = 0; i < nums.length;i++){
//            int count = 0;
//            for(int j = 0; j < nums.length; j++){
//                if(nums[i]>nums[j] && i!=j){
//                    count++;
//                }
//            }
//            res[i] = count;
//        }

        System.out.println(Arrays.toString(res));



    }
}
