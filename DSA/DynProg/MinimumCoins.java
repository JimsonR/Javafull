package DynProg;

import Recursion.Main;

import java.util.HashMap;
import java.util.Map;

public class MinimumCoins {

    static Map<Integer , Integer> memo = new HashMap<>();
    static int answer;

    public static void main(String[] args) {
        // Given a set of coin values coins = {c1, c2,.....,ck} and a target sum of money m,what's the minimum number of coins that form the sum m?
        int[] coins = {5,4,1};
        int m = 13;
//        System.out.println(minimumCoins(m, coins));
        System.out.println(bottomUp(m, coins));




    }

    private static int bottomUp(int m, int[] coins) // bottom up approach
    {
        Map<Integer, Integer> memo = new HashMap<>();

        memo.put(0,0);
        for (int i = 1; i < m+1; i++) {
            for(int coin : coins){
                int subproblem = i - coin;
                if (subproblem < 0) {

                    continue;

                }
//                System.out.println(subproblem);
                memo.put(i,minIgnoreNone(memo.getOrDefault(i,0), memo.get(subproblem)+1));
            }
            System.out.println(memo);
        }
        return memo.get(m);
    }


    private static int minimumCoins(int m, int[] coins) // naive approach
    {
        if(memo.containsKey(m)){
            return memo.get(m);
        }
        if(m==0){
            answer = 0;
        }
        else{
            for(int i = 0 ; i < coins.length ; i++){
                int subproblem = m - coins[i];
                if(subproblem < 0){
                    // skip solutions where we try to reach [m] from negative subproblem.
                    continue;
                }
                answer = minIgnoreNone(answer , minimumCoins(subproblem, coins)+1);
//                System.out.println(answer);

            }
        }
        memo.put(m,answer);
        return answer;
    }

    private static int minIgnoreNone(int a, int b) {
        if(a < 1){
            return b;
        }
        if (b < 1){
            return a;
        }
        return Math.min(a, b);
    }

}
/*
The reason this function is efficient because the answer for each sub problem is calculated
recursively only once, after it is completed once it can be efficiently retrieved next time the function is called for the same parameter
The time complexity is of O(M*K) where k is the number of coins and m is target sum
This is because we iterate over each coin to find the best solution for each subproblem
 */