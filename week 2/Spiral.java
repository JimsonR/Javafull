import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral {
    static ArrayList<Integer> newlistitems(int[][] matrix, int top, int bottom, int left, int right,ArrayList<Integer> result){
        if(top>bottom || left>right){
            return new ArrayList();
        }
        for(int i =left;i<matrix[0].length;i++){
            result.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<matrix.length;i++){
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
            for(int i = right;i<left-1;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        if(right<=left){
            for(int i = bottom;i<top;i--){

                result.add(matrix[i][left]);
            }
            left--;
            newlistitems(matrix,top,bottom, left,right,result);
        }

        }
//        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
       int[][] matrix =
               {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
       ArrayList<Integer> results = new ArrayList<>();
        System.out.println( newlistitems(matrix, 0, matrix.length-1,0,matrix[0].length-1,results));





      int[] path = {matrix[0][0],matrix [0][1], matrix[0][2], matrix[1][2], matrix[2][2], matrix[2][1], matrix[2][0], matrix[1][0], matrix[1][1]};
      int [] res = new int[matrix.length*matrix[0].length];
        ArrayList<Integer> result = new ArrayList();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(i +""+j+" ");
//
//
//            }
//            System.out.println();
//        }

        for (int i = 0; i < matrix[0].length; i++) {
//            System.out.print(matrix[0][i]+" ");
            result.add(matrix[0][i]);
//            res = matrix[0][i];

        }
        for (int i = 1; i < matrix.length; i++) {
//            System.out.print(matrix[i][matrix.length-1]+" ");
            result.add(matrix[i][matrix.length-1]);
        }
        for (int i = 1; i >= 0; i--) {
//            System.out.print(matrix[2][i]+" ");
            result.add(matrix[2][i]);

        }
        for (int i = 0; i < matrix[1].length-1; i++) {
//            System.out.print(matrix[1][i]+" ");
            result.add(matrix[1][i]);
        }
//        System.out.println(result);




    }
}
