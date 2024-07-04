import java.util.Scanner;

class AgeNotMet extends RuntimeException{
    AgeNotMet(String msg){
        super(msg);
    }

}
public class Customexceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

//        try {
            if (a < 18) {
                throw new AgeNotMet("Age not met");

            }
//        }catch (AgeNotMet e){
//            e.printStackTrace();
//        }
    }
}
