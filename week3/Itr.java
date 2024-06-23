import java.util.HashMap;
import java.util.Iterator;

public class Itr {
    public static void main(String[] args) {
        HashMap<Integer,Integer> sadasd = new HashMap<>();
        sadasd.put(1,2);
        sadasd.put(2,3);
        sadasd.put(3,4);
        Iterator<Integer> it = sadasd.keySet().iterator();
        for(Integer i : sadasd.keySet()) {
            System.out.println(sadasd.get(i));
        }
    }
}
