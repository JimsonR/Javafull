public class Numrev {
    public static void main(String[] args) {
        int num = 232;
        int rev =0 ;
        int temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            rev = (rev*10)+remainder;
            temp = temp/10;
        }
        System.out.println(rev);
    }
}
