import java.util.Arrays;

public class Typecast {
    public static void main(String[] args) {
        int c = 10;
        int a = 10;
        float f = 123.235f;
        long l = (int)10;
        byte b = (int)127;
        boolean bool = true;
        System.out.println(a);
        System.out.println(c);
        System.out.println(f);
        System.out.println(l);
        System.out.println(b);
        int[] arr = {16};
        int[][] queries = {{0,0},{0,0},{0,0},{0,0}};
        int[] result = new int[queries.length];

        // for(int i = 0 ; i < arr.length ; i++){

        //     hm.put(i,arr[i]);

        // }


        for(int i = 0 ; i < queries.length ; i++){
//            result[i] = arr[queries[i][0]];

                result[i] =  arr[queries[i][0]] ^ arr[queries[i][1]];


        }
        System.out.println(Arrays.toString(result));

        System.out.println(3 & 3 & 3);
    }


}
