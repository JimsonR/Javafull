import java.util.Arrays;

public class Matrixp1 {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][]  matrix2 =
                {{9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};
        int[][] res = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
//                System.out.print(matrix2[i][j] + " ");
                res[i][j] = matrix1[i][j]+matrix2[i][j];


            }




        }
//        System.out.println(Arrays.deepToString(res));
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
