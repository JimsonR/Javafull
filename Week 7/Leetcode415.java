import java.math.BigInteger;

public class Leetcode415 {
    public static void main(String[] args) {
        String first = "11";
        String second = "123";
        int l1 = first.length()-1;
        int l2 = second.length()-1;

        int sumOfTwo = 0;

        int carry = 0;
        StringBuilder res = new StringBuilder();

        while(l1>=0 || l2>=0 || carry>0){
            int digit1 = (l1>=0)?Character.getNumericValue(first.charAt(l1)):0;
            int digit2 = (l2>=0)?Character.getNumericValue(second.charAt(l2)):0;

            sumOfTwo = digit1+digit2+carry;

            carry = sumOfTwo/10;

            sumOfTwo = sumOfTwo%10;

            res.insert(0,sumOfTwo);
            if(l1>=0){
               l1--;
            }
            if(l2>=0){
                l2--;
            }

        }
        System.out.println(res);
        System.out.println(BigInteger.TEN);

    }
}
