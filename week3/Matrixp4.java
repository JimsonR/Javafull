import java.util.Arrays;

public class Matrixp4 {
    public static void main(String[] args){
    int[][] matrix1 ={{1, 2},
            {3, 4},
            {5, 6}};

        int[][] matrix2 = {{7, 8, 9},
                          {10, 11, 12}};

        int[][] res = new int[3][3];
        for(int j = 0; j < matrix1.length; j++){
            for(int i = 0; i < matrix2[0].length; i++) {
                for (int k = 0; k < matrix1[i].length; k++) {
//                    System.out.print(matrix1[i][k]*matrix2[k][j]+" ");
                    res[i][j] += matrix1[i][k]*matrix2[k][j];
            }
        }
        System.out.println();
        }
System.out.println(Arrays.deepToString(res));
//for(int j = 0; j < matrix1.length; j++){
//    for(int i = 0; i < matrix2[0].length; i++){
//        res[i][j] = matrix1[0][j]*matrix2[i][j];
//        System.out.print(j+""+i+" ");
//
//    }
//    System.out.println();
//}
            }

        }



