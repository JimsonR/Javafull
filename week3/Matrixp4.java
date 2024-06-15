import java.util.ArrayList;
import java.util.Arrays;

public class Matrixp4 {
//    static int[][] recurmul(int[] matrix1elms, int[] matrix2elms) {
////        int[][] result = new int[3][3];
////        for (int i = 0; i < matrix1elms.length; i++) {
////            for (int j = 0; j < matrix2elms.length; j++) {
////                result[i][j] += matrix1elms[i] * matrix2elms[j];
////            }
////
////        }
////        return result;
////    }
    public static void main(String[] args){
//        System.out.println(recurmul());
    int[][] matrix1 ={{1, 2},
            {3, 4},
            {5, 6}};

        int[][] matrix2 = {{7, 8, 9},
                          {10, 11, 12}};
        System.out.println(Arrays.deepToString(recurmul(matrix1[0],matrix2[0])));

        int[][] res = new int[3][3];
        ArrayList<int[]> list1 = new ArrayList<>();
        for(int j = 0; j < matrix1.length; j++){
            for(int i = 0; i < matrix2[0].length; i++) {
                for (int k = 0; k < matrix1[i].length; k++) {
//                    System.out.print(matrix1[i][k]*matrix2[k][j]+" ");
                    res[i][j] += matrix1[i][k]*matrix2[k][j];
//                    list1.add({matrix1[i][k]*matrix2[k][j]});
            }

        }
            list1.add(res[j]);
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
//        for(int j = 0; j < res.length; j++){
//            list1.add(res[j]);
//
//        }
        System.out.println(Arrays.deepToString(list1.toArray()));
            }

        }



