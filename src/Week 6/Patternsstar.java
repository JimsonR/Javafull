package Week

public class Patternsstar {

 static    {
        Integer i ;
    }

    public static void main(String[] args) {

            for(int i = 0;i<10;i++){
                for(int j=0;j<12;j++ ){
                    if(i > 0  && i< 9){
                        if(j==0){
                            System.out.print((char)(65+j));
                        }
                        else if(j==11){
                            System.out.print(" "+(char)(65+j));
                        }
                         else   if (j == 7 && i != 8 || j == 8 && i != 8) {
                            System.out.print("*" + " ");
                        } else{
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
