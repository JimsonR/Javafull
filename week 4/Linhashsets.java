import java.util.LinkedHashSet;

public class Linhashsets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        System.out.println(lhs);
       for (Integer i : lhs) {
           System.out.println(i);
       }
    }
}
