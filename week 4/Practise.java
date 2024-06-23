import java.util.*;

//interface Int{
//    void show();
//}
interface Newinter{
    void show();
}
 public class Practise implements Newinter{
//    void show(){
//
//    }

    public static void main(String[] args) {
        char[] carr= {'h','e','l','l','o'};
        int[] iarr= {1,2,3,4,5};
//        System.out.println(String.valueOf(iarr));
        System.out.println(String.valueOf(carr));
        StringBuffer sb=new StringBuffer();
        StringBuilder sbuilder=new StringBuilder();

        int[][] arrs = {{1,2,3},
                        {5,6,6},
                        {7,8,6},
                        {9,0,5}};
        int[][] arrs2 = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};

        int[][] res = new int[arrs.length][arrs2[0].length];
        for (int k = 0; k < arrs.length; k++) {
        for (int i = 0; i < arrs2[0].length; i++) {
            for (int j = 0; j < arrs[0].length; j++) {
//                System.out.print(arrs[k][j]+" "+arrs2[j][i]+" ");
                res[k][i] += arrs[k][j]*arrs2[j][i];
            }

//            System.out.println();
        }
//        System.out.println(Arrays.deepToString(res));
        }
        for (int k = 0; k < res.length; k++) {
            System.out.println(Arrays.toString(res[k]));

        }

        int[] dupp = {2,4,2,4,3,1,4};
        HashMap<Integer,Integer> map = new HashMap();
        LinkedHashMap<Integer,Integer> map2 = new LinkedHashMap<>();
        for (int k = 0; k < dupp.length; k++) {
            if(map.containsKey(dupp[k])) {
                map.put(dupp[k],map.get(dupp[k])+1);
            }
            else{
                map.put(dupp[k], 1);
            }

        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
        }
//        int c = 0;
        for(int i: dupp){
            if(map2.containsKey(i)) {
                map2.put(i,map2.get(i)+1);

            }
            else {
                map2.put(i, 1);
            }

        }
        System.out.println(map2);
        for(Map.Entry<Integer,Integer> entry : map2.entrySet()) {
            if (entry.getValue() != 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
