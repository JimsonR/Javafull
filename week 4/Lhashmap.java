import java.util.Iterator;
import java.util.LinkedHashMap;

public class Lhashmap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("a", 1);
        lhm.put("b", 2);
        lhm.put("c", 3);
        lhm.put("d", 4);

        Iterator it = lhm.entrySet().iterator();
        for(Iterator iterator = lhm.keySet().iterator(); iterator.hasNext();) {
            Object key = iterator.next();
            Object value = lhm.get(key);
            System.out.println(key + "=" + value);
        }
//        lhm.


    }
}
