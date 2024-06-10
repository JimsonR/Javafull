public class Matrixp3 {
    public static void main(String[] args) {
        int[][] matrix =
                {{1, 2, 3},
                        {4, 5, 9},
                        {7, 8, 9}};
        int target = 4;
//        boolean found = false;
//        l1 :for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                if (matrix[row][col] == target) {
//                    System.out.print((row+1 )+" "+ (col + 1));
//                    found = true;
//                    break l1;
//                }
//
//            }
//
//        }
//       if(!found){
//           System.out.println(-1);
//       }

       int i = 0;
       int j = 0;
       while(i < matrix.length ) {
       System.out.print(matrix[0][j]);
       System.out.print(matrix[1][j]);
       System.out.print(matrix[2][j]);
           i++;
           j++;
       }
    }
}
