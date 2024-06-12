import java.util.Arrays;
import java.util.HashMap;

public class Matrixp3 {
    public static void main(String[] args) {
        int[][] matrix =
                {{1, 2, 3},
                        {4, 5, 9},
                        {7, 8, 9}};
        int target = 4;
        int[] arr = new int[matrix.length * matrix[0].length];
        HashMap<Integer, int[]> map = new HashMap<>();

        boolean found = false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row * 3 + col] = matrix[row][col];


//                System.out.println(s);
                if (map.containsKey(matrix[row][col])) {

                } else {
                    map.put(matrix[row][col], new int[] {row,col});
//                    System.out.println(map);
                }
            }

//                if (matrix[row][col] == target) {
////                    System.out.print((row+1 )+" "+ (col + 1));
//                    found = true;
//                    break l1;
//                }
//
        }
//        System.out.println(map);
        if (map.containsKey(target)) {
            System.out.println(Arrays.toString(map.get(target)));
        }
    }
}
//       if(!found){
//           System.out.println(-1);
//       }

//        System.out.println(Arrays.toString(arr));
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 1; j < arr.length; j++) {
//                if(arr[j-1] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//
//                }
//
//            }
//        }



