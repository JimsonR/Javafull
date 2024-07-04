package Week

import java.util.Arrays;

class Aero{
    {
        new Aero();
    }

}
public class PewPew{
    public static void main(String[] args) {
           int[][] matrix1 = {

                   {3,2,5,6,6,5},
                   {2,5,3,7,6,4},
                   {6,4,3,3,6,4},
                   {3,3,4,6,7,5}

                    };
         int  matrix2[][] = {

                 {6,3,6,4},
                 {5,7,6,4},
                 {4,7,8,6},
                 {6,6,4,3},
                 {4,7,8,6},
                 {4,7,8,6},


         };
         int[][] res = new int[4][4];

         for(int i = 0; i < matrix1.length; i++ ){

             for(int j = 0; j < matrix2[0].length; j++){

                 for(int k = 0; k < matrix2.length;k++){

//                     System.out.println();

                     res[i][j] += matrix1[i][k]*matrix2[k][j];

                     System.out.println(Arrays.deepToString(res));

                 }
             }
         }
        System.out.println(Arrays.deepToString(res));
        System.out.println(48+36);

    }
}

class Aws{
    int i;
    Aws(){

    }
    public Aws(int j){
        i = j;
    }
}
class Wase extends Aws{
    
//    Wase(int k){
//        super(9);
//    }
}