package DynProg;

import java.util.HashMap;
import java.util.Map;

public class HowManyWays {

   static Map<Integer, Integer> memo = new HashMap<>();

    static int howManyWays(int m , int[] coins){

        memo.put(0,1);

        for(int i = 1; i < m+1 ; i++) {
            memo.put(i, 0);
            for (int coin : coins) {
                int subproblem = i - coin;
                if (subproblem < 0) continue;

                memo.put(i, memo.getOrDefault(i, 0) + memo.getOrDefault(subproblem,0));

            }
        }

        return memo.get(m);
    }

    public static void main(String[] args) {

        int[] coins = {5,4,1};
        int m = 5;

        System.out.println(howManyWays(m,coins));
    }
}
