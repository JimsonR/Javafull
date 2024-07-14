public class Powers {

  static int power(int num, int pow){
        if(pow==0) {

          return 1;
        }
//        else{
//            System.out.println(num);
//            num *= pow;
//            pow--;
//        }
      return num*power(num, pow-1);
  }

    public static void main(String[] args) {
      int num = 3;

      int pow = 5;
       java.lang.System.out.println(power(num, pow));
throw new java.lang.ArithmeticException();


    }
}
