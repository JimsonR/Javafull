import java.util.Arrays;
import java.util.HashMap;

public class Leetdiscuss {
    public static void main(String[] args) {

        int [] nums ={8,1,2,2,3};

        int[] count = new int[100];

        int[] res = new int[nums.length];

        for(int i = 0; i <nums.length;i++ ){

            count[nums[i]]++;

        }


//        System.out.println(Arrays.toString(count));
        for(int i = 1 ; i<100; i++){

            count[i] += count[i-1];
//            System.out.println(count[i-1]+" "+i);

        }

//        System.out.println(Arrays.toString(count));
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                res[i] = 0;
            }else {
                res[i] = count[nums[i]-1];
            }

        }

//        System.out.println(Arrays.toString(res));
//        int  res[] = new int[nums.length];
//        for(int i = 0; i < nums.length;i++){
//            int count = 0;
//            for(int j = 0; j < nums.length; j++){
//                if(nums[i]>nums[j] && i!=j)
//                {
//
//                    count++;
//
//                }
//            }
//            res[i] = count;
//        }
        HashMap<Integer,Integer> seen = new HashMap<>();
        int[] res1 = new int[nums.length];
        int[] copy = nums.clone();
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));
        for(int i = 0; i< copy.length; i++){
            seen.putIfAbsent(copy[i], i);
        }
        System.out.println(seen);
        for(int i = 0;i< nums.length;i++){
            res1[i] = seen.get(nums[i]);
        }
        System.out.println(Arrays.toString(res1));

    }
}
