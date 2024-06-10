//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fib {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String s = "abc";
        int a = 0;
        int b = 1;
        System.out.println(s.getClass().getName());
        for(int i = 0; i<10; i++){
            int temp = a ;
            a = b;
            b = b + temp;
            System.out.println(temp);

        }
    }
}