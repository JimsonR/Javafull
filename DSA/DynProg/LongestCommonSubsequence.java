package DynProg;

import java.util.*;

public class LongestCommonSubsequence {
    static int[] a = {1,4,5,6,9,10,11};
    static int[] b = {6,4,5,9,11};
   static int[][] dp = new int[a.length+1][b.length+1];


   static int longestCommonSubsequence(int[] a, int[] b){

        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= b.length; j++) {
                if(a[i-1] == b[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }

        }
       for(int[] arr: dp){
           System.out.println(Arrays.toString(arr));
       }

        return dp[a.length][b.length];

    }

    static List<Integer> reconstructElements(int[][] dp, int[] a, int[] b){

        ArrayList<Integer> elements = new ArrayList<>();

        int i = a.length;
        int j = b.length;

       while (i > 0 && j > 0){
           if(a[i-1] == b[j-1]){
               elements.add(a[i-1]);
           i--;
           j--;
           }else if(dp[i-1][j] > dp[i][j-1]){
               i--;
           }else{
               j--;
           }
       }
//elements.reversed();
       return elements.reversed();
    }

    public static void main(String[] args) {
    /*
    Given tw0  sequences of numbers, A and B, what is their longest common subsequence?
    */

        Map<Integer , Integer> c = new HashMap<>();
        c.putIfAbsent(0,1);
        System.out.println(c);
        System.out.println(-2%4);
        System.out.println(longestCommonSubsequence(a,b));

        System.out.println(reconstructElements(dp,a,b));


    }
}
