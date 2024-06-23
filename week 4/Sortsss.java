import java.util.HashSet;
import java.util.TreeSet;

public class Sortsss {
    public static void main(String[] args) {
        int[] arr= {4,3,2,5,2,6,7,8};
        HashSet<Integer> set= new HashSet<>();
        TreeSet<Integer> tset= new TreeSet<>();
        for(int i: arr){
            set.add(i);
            tset.add(i);
        }
        System.out.println(set);
        System.out.println(tset.descendingSet());
    }
}
