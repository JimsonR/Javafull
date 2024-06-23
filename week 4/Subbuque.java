import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Subbuque {
    public static void main(String[] args) {
        HashMap<Integer, String> var = new HashMap<>();


        var.put(1, "A");
        var.put(2, "B");
        var.put(3, "C");
        var.put(4, "D");
        LinkedHashMap<Integer, String> var2 = new LinkedHashMap<>(var);
        System.out.println(var2);
        Iterator it = var2.entrySet().iterator();
        for(; it.hasNext(); ) {
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());

        }
//        while (var2.) {
//
//        }
        for(Integer i : var.keySet()){
            System.out.println(i+" "+ var.get(i));
        }
        Map.Entry<Integer, String> e = var.entrySet().iterator().next();
        System.out.println(e.getKey());
        for(Map.Entry<Integer, String> m : var.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
        Iterator<Integer> it1= var.keySet().iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
