import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;

public class Jyoths2134 {
   static double pow(double x,int n ){
    if(n==1){
       return x;
    }
        return x*pow(x,n-1);
    }
    public static void main(String[] args) {
        Double x = 2.0000;
        int n = 10;
        System.out.println(BigDecimal.valueOf(pow(x,n)));
        LinkedList<Integer> linkedList = new LinkedList<>();

        int num = 120;

        long reverse = 0;

        while(num!=0){
            int rem = num%10;
            reverse = (reverse*10)+rem;
            num = num/10;
        }
        System.out.println(reverse);
if(reverse > Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
    System.out.println(0);
}
else{
    System.out.println(reverse);
}
                int  dividend = -2147483648;
               int divisor = -1;


        long quotient = dividend/divisor;
//        System.out.println(quotient);
        if(quotient > Integer.MAX_VALUE ) {
            System.out.println(Integer.MAX_VALUE);
        }
            else if(quotient<Integer.MIN_VALUE){
                System.out.println(Integer.MIN_VALUE);
            }else {
//            System.out.println((int)quotient);
        }

      String s =   "498828660196";

        System.out.println(s.charAt(0)-'0');



    }
}
