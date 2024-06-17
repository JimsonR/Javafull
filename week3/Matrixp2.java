import java.util.ArrayList;
import java.util.Arrays;

public class Matrixp2 {
    public static void main(String[] args) {
        int[][] matrix =    //
                {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] matrix2 = new int[matrix.length][matrix[0].length];
        ArrayList<int[]> list = new ArrayList<>();
    for (int i = 0; i < matrix.length; i++) {
        for (int j = matrix[0].length-1; j >= 0; j--) {
//            System.out.print(matrix[j][i] + " ");
            matrix2[i][matrix.length-j-1] = matrix[j][i];

            System.out.println(Arrays.deepToString(matrix2));

        }
        list.add(matrix2[i]);
        System.out.println();
    }
    System.out.println(Arrays.deepToString(matrix2));
    System.out.println(Arrays.deepToString(list.toArray()));
    }
}
