package Subpack;

import Mypack.Accesspractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Accessor extends Accesspractise {

    static int gcd(int a, int b){
        if(b==0){
           return a;
        }

        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(56,98));
        System.out.println(Accessor.j);
        System.out.println(new Accesspractise().nonStatic_l);
        System.out.println(new Accessor().nonStatic_k);

        int[] arr = {1, 2, 3, 2, 4, 5, 1,};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList());
        ArrayList<Integer> arrayList = new ArrayList<>();
       int bit = 0;

       for(int i = 0 ; i< arr.length; i++){
            if(!hashSet.add(arr[i])){
                System.out.print(arr[i]);
            }
//            if(!arrayList.contains(arr[i])){
//                arrayList.add(arr[i]);
//            }
//
//            else
//
//            {
//                System.out.println(arr[i]);
//            }
        }
        System.out.println(hashSet);


        String str = "abcdef";
        String substr = str.substring(2);
        System.out.println(substr);
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
//        System.out.println(bit);
    }
}
