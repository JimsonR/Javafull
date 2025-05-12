import java.util.Arrays;

public class Stringcreation {
    public static void main(String[] args) {
        String s = new String("Hello World");
        char[] chars = {'h','i','m'};
        String s1 = "asdasd";

        System.out.println(s.hashCode());
        System.out.println(new String(chars));
    }
}
