import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
public class Exceptionh {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

//        BufferedReader br = new Buf
//        feredReader(new InputStreamReader(System.in));

//        System.out.println("Enter number: ");
//        int number = sc.nextInt();



        try {
            int a = sc.nextInt();
            if (a > 10) {
//            throw new Exception("Value must be lesser than 10");
                throw new MyException("Oh no");

            }
        }catch (Throwable t){
            System.out.println(t.getMessage());
        }
        try{
            throw new IOException("asdasdsa");
        }
        catch (IOException r){

        }
        catch (Exception e){

        }
        catch (Throwable e){

        }

    }
}
