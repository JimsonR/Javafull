public class Spract {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3,4},
                          {4, 5, 6,5},
                          {7, 8, 9,6}};
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        if (top < bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
        }
        if (left < right) {
           for (int i = top; i <= bottom; i++) {
               System.out.print(matrix[i][right] + " ");
           }
         right--;
        }
        while (left <= right) {
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            else if (left <= right) {
                for (int i = bottom; i >= top; i--) {
//                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
