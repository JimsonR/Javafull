import java.util.Arrays;

public class Leetcode2191 {
    Leetcode2 leetcode2;
    Leetcode2191(Leetcode2 leetcode2){
        this.leetcode2 = leetcode2;
    }
    public static void main(String[] args) {
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {991,338,38};
        int n = nums.length;
        int[][] arr= new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            if(nums[i]==0)
                arr[i][1]= mapping[0];

            for(int j = nums[i],k=1;j>0;) {

                arr[i][1] += (mapping[j % 10] * k);
                j /= 10;
                k*=10;
            }
            System.out.println(Arrays.deepToString(arr));
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[1], b[1]));

        for(var i =0 ; i< n; i++){
            nums[i] = arr[i][0];
        }
        System.out.println(Arrays.toString(nums));

    }
}
