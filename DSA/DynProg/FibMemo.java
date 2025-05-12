package DynProg;

import java.util.HashMap;
import java.util.Map;

public class FibMemo {
    //DP = Recursion + Memoization
    // Bottom Up

    static Map<Integer, Long> memo = new HashMap<>();
    public static long fib(int n){

        long result;
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n <= 2){
            result = 1;
        }else {
            result = fib(n-1)+fib(n-2);
        }
        memo.put(n,result);
//        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {


        System.out.println(fib(50));
        // number of memorized calls is n
        // The function will call recursion only th first time for each value
        // next time, it will retrieve the value from the dictionary, which is fast
        // which number of non-memoized calls is n
        // Each non memoized call ignoring the non memoized call takes O(1) to compute
        // This is why total running time complexity is linear
        // Time Complexity O(n)

    }

}
