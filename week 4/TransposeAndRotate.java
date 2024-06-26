import java.util.Arrays;

public class TransposeAndRotate {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int[][] transposed = new int[matrix.length][matrix[0].length];
        int[][] rotated = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
                rotated[i][matrix[0].length-1-j]=matrix[j][i];

            }
//            System.out.println(Arrays.toString(transposed[i]));
//            System.out.println(Arrays.toString(rotated[i]));



        }



//        System.out.println(Arrays.toString(transposed[0])+"\n"+Arrays.toString(transposed[1])+"\n"+Arrays.toString(transposed[2]));
        System.out.println(Arrays.toString(rotated[0])+"\n"+Arrays.toString(rotated[1])+"\n"+Arrays.toString(rotated[2]));

    }
}
