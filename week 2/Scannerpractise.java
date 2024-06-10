import java.util.Scanner;

public class Scannerpractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                System.out.println(x);
            }
        }
    }
}
