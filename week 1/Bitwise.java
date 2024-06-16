public class Bitwise {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(~b);
//        a &= b;
        System.out.println(a);
        System.out.println("right shift: " + (a >> 2));
        System.out.println("left shift: " + (a << 2));
        System.out.println("unsigned right shift: "+ (a >>> 2));
//        System.out.println("unsigned left shift: "+ (a <<< 2);
    }
}
