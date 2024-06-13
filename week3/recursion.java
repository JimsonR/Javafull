class Rec {

}
public class recursion {
     static void rec(int a) {

        if (a == 1) {
            System.out.println(a);
            return;
        }

        a--;
        for(int i = 0 ; i < a; i++) {
//            System.out.println(a);
            rec(a);
        }

//        System.out.println(a);

    }

    public static void main(String[] args) {

        rec(10);

    }
}
