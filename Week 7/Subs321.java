import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Subs321 {
    public static void main(String[] args) {
        String s = "jimson";

        for(int i = 0; i < s.length()*2;i++){
            if(i>s.length()-1){
//             System.out.println(s.length()-i%s.length());
                System.out.println(s.substring(0,s.length()-i%s.length()));
            }
            else{
                System.out.println(s.substring(0,i%s.length()));
            }
        }
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        TreeMap<Integer,String> sort = new TreeMap<>(Comparator.reverseOrder());
        for(int i = 0; i<heights.length;i++){
            sort.put(heights[i], names[i]);
        }
        System.out.println(Arrays.toString(sort.values().toArray(names)));

    }
}
