import java.util.Collections;
import java.util.Vector;

public class Patternsstar {

 static    {
        Integer i ;
    }

    public static void main(String[] args) {

            for(int i = 0;i<10;i++){
                for(int j=0;j<40;j++ ){
                    if(i > 0  && i< 9){
                        if(j==0){
                            System.out.print((char)(65+j));
                        }
                        else if(j==39){
                            System.out.print(" "+(char)(65+j));
                        }
                         else   if (j == 7 && i != 8 && i!= 1 || j == 8 && i != 8&& i!= 1) {
                            System.out.print("*" + " ");
                        }
                         else if(j>2 && j<7 && i == 7 | i == 6 ){
                            System.out.print("*"+" ");
                        }
                        else   if (j == 10 && i != 8 && i!= 1 || j == 11 && i != 8&& i!= 1) {
                            System.out.print("*" + " ");
                        }
                        else   if (j == 13 && i != 8 && i!= 1 || j == 14 && i != 8&& i!= 1) {
                            System.out.print("*" + " ");

                        }else   if (j == 18 && i != 8 && i!= 1 || j == 19 && i != 8&& i!= 1) {
                            System.out.print("*" + " ");
                        }
                        else if(){

                        }

                         else{
                            System.out.print("  ");
                        }

                    }
                    else
                    System.out.print((char)(65+j)+" ");
//                    System.out.print("*"+" ");
                }

                System.out.println();
            }

    }

}
