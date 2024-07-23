import java.util.Arrays;

public class LeetcodeGudPairs {
    public static void main(String[] args) {
        int [] nums= {1,2,3,1,1,3};
        int ans = 0;
        int[] newN = new int[101];

        for(int i: nums){
            ans += newN[i]++;
        }
        System.out.println(Arrays.toString(newN));
    }
}
