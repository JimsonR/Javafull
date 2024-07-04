import java.util.Collections;
import java.util.Vector;

public class Patternsstar {

 static    {
        Integer i ;
    }

    public static void main(String[] args) {

            for(int i = 0;i<10;i++){
                for(int j=0;j<45;j++ ){
                    if(i > 0  && i< 9){
                        if(j==0){
                            System.out.print("x");
                        }
                        else if(j==44){
                            System.out.print("  "+"x");
                        }
                        // J
                         else   if (j == 7 && i != 8 && i!= 1 || j == 8 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");
                        }
                         else if(j>2 && j<7 && i == 7 | i == 6 ){
                            System.out.print(" "+"  ");
                        }
                        else   if (j == 10 && i != 8 && i!= 1 || j == 11 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");
                        }
                        else   if (j == 13 && i != 8 && i!= 1 || j == 14 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");

                        }
                        //M
                    else if (j == 20 && i != 8 && i!= 1 || j == 21 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");
                        }
                    else if (j == 15 && i== 2|| j == 19 && i==2) {

                            System.out.print(" "+"  ");
                        }
                    else if(j == 15 && i == 3 || j == 19 && i == 3){
                            System.out.print(" "+"  ");

                        }
                        else if(j == 16 && i == 4 || j == 18 && i == 4){
                            System.out.print(" "+"  ");
                        }
                        else if(j == 17 && i == 5 ){
                            System.out.print(" "+ "  ");
                        }


                        // M

                        else   if (j == 23 && i != 8 && i!= 1 || j == 24 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");

                        }
                        else if (j == 30 && i != 8 && i!= 1 || j == 31 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");
                        }

                        else if (j == 25 && i== 2|| j == 29 && i==2 ) {

                            System.out.print(" "+"  ");
                        }


                        else if(j == 25 && i == 3 || j == 29 && i == 3){
                            System.out.print(" "+"  ");

                        } else if (j==26 && i==4 || j == 28 && i == 4) {
                            System.out.print(" "+"  ");

                        }
                        else if (j==27 && i == 5) {
                            System.out.print(" "+"  ");

                        }

                        // Y

                        else if(j == 34|j==35 && i == 3 | i == 2|| j == 40 | j == 41 && i == 3 | i ==2 ){
                            System.out.print(" "+"  ");

                        }
                        else if(j == 36 | j == 35 && i == 4 || j==39 | j == 40 && i == 4   ){
                            System.out.print(" "+"  ");

                        }
                        else if (j == 37 | j == 38 && i>4 && i < 8 ) {
                            System.out.print(" "+"  ");
                        }



                        else{
                            System.out.print("  S");
                        }

                    }
                    else
                    System.out.print("x"+"  ");
//                    System.out.print("*"+" ");
                }

                System.out.println();
            }

    }

}
