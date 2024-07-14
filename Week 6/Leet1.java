import java.util.Arrays;

public class Leet1 {
    public static void main(String[] args) {
        String s = "babad";

//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)==s.charAt(s.length()-i-1)){
//                System.out.print(s.charAt(i));
//
//            }
//        }


//        int[] nums = {3,0,1};
int [] nums = {9,6,4,2,3,5,7,0,1};
//        Arrays.sort(nums);
      int sum = 0;
        int total = 0;
    for(int i = 1 ; i <= nums.length; i++){
//        if(nums[i]-(i-1) != 1){
//            System.out.println(i);
//        }
        total += i;

        sum += nums[i-1];

    }


        System.out.println(total-sum);


    }
}
