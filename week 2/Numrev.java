import java.util.*;

public class Numrev {
    public static void main(String[] args) {
        int num = 233;
        int rev =0 ;
        int temp = num;
        Stack<Integer> stack = new Stack();
//        while (temp > 0) {
//            int remainder = temp % 10;
//            rev = (rev*10)+remainder;
//            temp = temp/10;
//        }
//        HashSet<Integer> hs = new HashSet<>();

//        System.out.println(rev);

        while(temp>0){
//            System.out.println(temp);
            int rem = temp%10;
            stack.push(rem);
            temp /= 10;

        }
//        System.out.println(stack.pop());
//        System.out.println(stack);





    }
}
