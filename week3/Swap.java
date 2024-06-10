public class Swap {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int i = 2;
        int j = 3;

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: "+a+" b: "+b);

        j +=i;
        i = j-i;
        j=j-i;
        System.out.println("i: "+i+" j: "+j);

    }
}
