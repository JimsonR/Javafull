import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral2 {
    public static void main(String[] args) {
        int n = 3;

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

//        List<Integer> res = new ArrayList<>();

        int[][] res = new int[n][n];

        int num = 1;

        while(left <= right || top <= bottom){

            for(int i = left ; i <= right ; i++){
                res[top][i] = num++;
            }
            top++;
            for(int i = top; i <= bottom ; i++){
                res[i][right] = num++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left ; i-- ){
                    res[bottom][i] = num++;
                }
                bottom--;
            }
            if(left <= right){
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = num++;
                }
                left++;
            }


        }
        System.out.println(Arrays.deepToString(res));


    }
}
