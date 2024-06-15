import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Hashprogs {
    public static void main(String[] args) {
        int[] roll_num = {1,2,3,4,5,6,7,8,9};
        int[] marks = {23,43,22,11,22,55,44,22,56};
        Hashtable mark_hash = new Hashtable();
        for(int i = 0; i < roll_num.length; i++){
            mark_hash.put(roll_num[i], marks[i]);

        }
        Enumeration e = mark_hash.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        }
    }

