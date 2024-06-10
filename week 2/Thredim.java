import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Thredim {
    public static void main(String[] args) {


//        ArrayList<Integer> list = new ArrayList<Integer>();
        int [][][][] arr  = new int [3][3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                       arr[i][j][k][l] = i + j + k+l;
                       System.out.print(arr[i][j][k][l] + " ");
                    }
                }
                System.out.println();


            }


        }
    System.out.println(Arrays.deepToString(arr));
    }


}
