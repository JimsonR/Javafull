import java.util.TreeMap;
import java.util.TreeSet;

public class Treesetmap {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("B");
        ts.add("a");
        ts.add("C");

        System.out.println(ts);

        TreeMap tm = new TreeMap();

        tm.put("11", "B");
        tm.put("222", "A");
        tm.put("c", "D");
        System.out.println(tm);

    }
}
