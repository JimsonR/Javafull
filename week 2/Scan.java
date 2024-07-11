import java.util.ArrayList;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String s = in.next();
            list.add(s);
        }
        System.out.println(list);
        String s = in.next();
        boolean found = in.nextBoolean();
//        char c = ;

    }
}
