import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.println("operation : ");
        int opr = sc.nextInt();
        switch (opr) {
            case 1:
                res = num1 + num2;
                System.out.println("The sum is " + res);

            case 2:
                 res =num1-num2;
                System.out.println("The difference is " + res);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
