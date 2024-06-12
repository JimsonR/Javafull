import java.util.Scanner;

public class Myinterview {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        for (int i = sc.nextInt(); i >0; i=i-50) {
            System.out.println(i);
        }
        sc.close();
    }
}
