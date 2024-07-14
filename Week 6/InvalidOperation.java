class InvalidOperationException extends Exception{
    InvalidOperationException(String s){
        super(s);
    }
}
public class InvalidOperation {
    static void divide(int numerator , int denominator)throws InvalidOperationException{
        if(denominator == 0) {
            throw new InvalidOperationException("Denominator cannot be zero");
        }
        int c = numerator/denominator;
        System.out.println(c);

    }
    static void mchain(){

    }
    static int mchain(int i){
        mchain();
        return 1;
    }



    public static void main(String[] args) {

        try {
            divide(0,9);
         }catch (InvalidOperationException e){
        e.printStackTrace();
         }
    }
}
