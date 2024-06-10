import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 3;
//        System.out.println(in.h);

            for (int i = 0; i < n; i++) {

                if(in.hasNextInt()) {
                    int a = in.nextInt();
                System.out.println(a);
            }
            else{
                if (in.hasNext()){

                        in.next();
                    System.out.println("Not a number");
                    }
                else {
                    System.out.println("input lim reached");
                    break;
                }
                }

        }

            in.close();

    }
}
