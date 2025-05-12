package DynProg;

import java.util.*;

public class MazeProblem {




    static int gridPaths(int n , int m){
        int[][] memo = new int[n+1][m+1];

        for (int i = 1; i < n+1; i++) {
            memo[i][1] = 1;
        }
        for (int j = 1; j < m+1; j++) {
            memo[1][j] =  1;
        }

        for (int i = 2; i < n+1; i++) {
            for (int j = 2; j < m+1; j++) {
                memo[i][j] = memo[i-1][j] + memo[i][j-1];
            }
        }
        for(int[] arr : memo){
            System.out.println(Arrays.toString(arr));
        }
return memo[n][m];
    }

    public static void main(String[] args) {


        System.out.println(gridPaths(2,3));

    }
}
