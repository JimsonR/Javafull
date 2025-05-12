import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Newone2 {
    public static void main(String[] args) {

        String s = "Ecclipsee";
        char[] chars =  s.toCharArray();

        System.out.println((Arrays.toString(s.chars().toArray())));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        s.chars().filter(x->linkedHashSet.add(x)).forEach(x-> System.out.println((char)x));
        ArrayList<String> s1= new ArrayList<>();
//        s1.stream().forEach(x->);
        Collections.addAll(s1, s.split(""));

//        Scanner sc = new Scanner(System.in);

//        long l1 = sc.nextLong();
//        System.out.println(l1);
        String A="hello";
        String B="java";
        /* Enter your code here. Print output to STDOUT. */

        int l = A.length()+B.length();

        String res = A.length()<B.length()?"Yes":"No";

        String con = A.replaceFirst(A.charAt(0)+"", A.charAt(0)+"".toUpperCase())+" "+
                B.replaceFirst(B.charAt(0)+"",B.charAt(0)+"".toUpperCase());

        System.out.println(l);
        System.out.println(res);
        System.out.println(con);
//        Stream<String> stream = s1.stream().
        // HashMap<Integer, Integer> hm = new HashMap<>();
       int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        int[] result = new int[arr.length];

        // for(int i = 0 ; i < arr.length ; i++){

        //     hm.put(i,arr[i]);

        // }

//        System.out.println( Jyosalukkas.uhu );

        for(int i = 0 ; i < queries.length ; i++){
            result[i] = arr[queries[i][0]];
            for(int left = queries[i][0]+1 ; left <= queries[i][1] ; queries[i][0]++){
                result[i] ^=  arr[left];
            }
        }
        System.out.println(result);

        String s23 = "ji m";
        System.out.println(s23.split(" "));
        List<String> list = new ArrayList<>();

        for (String i : s23.split(" ")) {

        }
        String[] arr1 = {"mass","as","hero","superhero"};
        List<String> lst = new ArrayList<>();
        Collections.addAll(lst,arr1);
        for(int i = 0 ; i < arr1.length ; i++){
            lst.remove(arr1[i]);

        }



    }
}
