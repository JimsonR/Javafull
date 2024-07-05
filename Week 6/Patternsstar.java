import java.util.Collections;
import java.util.Vector;

public class Patternsstar {
public String I(){
    String s= """
            """;
    for(int i = 0 ; i< 10 ; i++){
        for(int j = 0; j < 10; j++ ){
            if(j == 5 | j == 6 && i>1 & i<9 ) {
//                System.out.print("*"+" ");
                s += "*"+" ";
            }
            else{

//                System.out.print(" ");
                s += "  ";

            }

            }
//        System.out.println();
        s += "\n";

    }
    return s;
}

public String[] m(){
    String[] s = new String[10];
    for(int i = 0; i < 10; i++){
        s[i] ="";
        for(int j = 0; j < 10 ; j++){

            if (j == 1 && i > 1 && i< 8 || j == 2 && i > 1 && i< 8) {
                s[i] += "* ";
            }

            else if (j == 8 && i > 1 && i < 8|| j == 9 && i > 1 && i < 8) {
                s[i] += "* ";
            }
            else if (j == 3 && i== 2 || j == 7 && i==2 ) {

                s[i] += "* ";
            }
            else if (j == 3 && i== 3|| j == 7 && i==3) {
                s[i] += "* ";
            }
            else if(j == 4 && i == 4 || j == 6 && i == 4){
                s[i] += "* ";
            }
            else if (j==5 && i == 5) {
                s[i] += "* ";

            }
            else{
                s[i] += "  " ;
            }

        }
//        s += "\n";
    }


    return s;
}
public String[] y() //j == 35|j==36 && i == 3 | i == 2|| j == 41 | j == 42 && i == 3 | i ==2
{
String[] s = new String[10];
for (int i = 0 ; i< 10; i++) {
    s[i] = "";
    for (int j = 0 ; j< 10 ; j++) {
        if (j == 0 | j == 1 && i == 3 | i == 2 || j == 7 | j == 8 && i == 3 | i == 2) {

            s[i]  += "* ";

        }
        else if (j == 1 | j == 2 && i == 4  || j == 6 | j == 7 && i == 4) {
//            System.out.print(" " + "  ");
            s[i] += "* ";
        }
        else if (j == 5 | j == 6 && i > 4 && i < 8) {
//            System.out.print(" " + "  ");
            s[i] += "* ";
        }
        else{
            s[i] += " ";
        }
    }
}

return s;
}
public String[] b(){
    String[] s = new String[10];

    for (int i = 0; i < 10; i++) {
        s[i] = "";
        for (int j = 0; j < 10; j++) {
            if(j == 1 && i >1 & i < 9 || j==2 && i >1 & i < 9 ){
                s[i] += "* ";

            }
            else if (j>2 && j<8 && i == 2 | i == 3) {
                s[i] += "* ";
            }
            else if (j == 7 && i >1 & i < 9 || j==8 && i >2 && i < 8 && i != 5 ) {
                s[i] += "* ";
            }
            else if (j>2 && j<8 && i == 7 | i == 8 ) {
                s[i] += "* ";
            }
            else if (j>2 && j<8 && i == 5) {

                s[i] += "* ";
            }
            else{
                s[i] += "  ";
            }
        }
    }


return s;
}
public String[] s(){
    String[] s = new String[10];
    for(int i = 0; i<10; i++){
        s[i] = "";
        for(int j=0; j<10; j++){
            if(j > 0 && j<9 && i == 1 | i==2 | i == 4 | i==5 | i == 7 | i == 8 ){
                s[i] += "* ";
            }
            else if(j == 1 | j == 2 && i == 3 ){
                s[i] += "* ";
            }
            else if (j == 7 | j == 8 && i == 6) {
                s[i] += "* ";

            } else{
                s[i] += "  ";
            }


        }


    }
    return s;
}
public String[] e(){
    String[] s = new String[10];
    for(int i = 0; i<10; i++){
        s[i] = "";
        for(int j=0; j<10; j++){
            if(j > 0 && j<9 && i == 1 | i==2 | i == 4 | i==5 | i == 7 | i == 8 ){
                s[i] += "* ";
            }
            else if(j == 1 | j == 2 && i == 3 ){
                s[i] += "* ";
            }
            else if (j == 1 | j == 2 && i == 6) {
                s[i] += "* ";

            } else{
                s[i] += "  ";
            }


        }


    }
    return s;
}

public String[] u(){
    String[] s= new String[10];

    for(int i = 0;i < 10 ; i++ ){
        s[i] = "";
        for(int j = 0 ; j<10 ; j++){
            if(j == 1 | j == 2 | j== 8 | j==7 && i>1 && i<8){
                s[i] += "* ";
            }
            else if (j > 1 && j < 8 && i == 7 | i == 8 ) {
                s[i] += "* ";
            }
            else{

                s[i] += "  ";
            }
        }

    }
  return s;
}




public String[] J(){
    String[] s = new String[10];
    for(int i = 0; i<10; i++){
        s[i] = "";
        for(int j = 0; j<10 ; j++){
            if(j == 8 | j == 9 && i>1 && i<8 ) {
//                System.out.print("*"+" ");
                s[i] += "*"+" ";
            }
            else if (j > 1 && i == 7 | i == 6 ){
            s[i] += "* ";
            }
            else{
                s[i] += "  ";
//                System.out.print(" ");
            }
        }
//        System.out.println();
//        s += "\n";
    }
    return s;
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
                         else   if (j == 6 && i != 8 && i!= 1 || j == 7 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");
                        }
                         else if(j>1 && j<6 && i == 7 | i == 6 ){
                            System.out.print(" "+"  ");
                        }
                         //I
                        else   if (j == 10 && i != 8 && i!= 1 || j == 11 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");
                        }
                        //M
                        else   if (j == 13 && i != 8 && i!= 1 || j == 14 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");

                        }

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

                        else   if (j == 24 && i != 8 && i!= 1 || j == 25 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");

                        }
                        else if (j == 31 && i != 8 && i!= 1 || j == 32 && i != 8&& i!= 1) {
                            System.out.print(" " + "  ");
                        }

                        else if (j == 26 && i== 2|| j == 30 && i==2 ) {

                            System.out.print(" "+"  ");
                        }


                        else if(j == 26 && i == 3 || j == 30 && i == 3){
                            System.out.print(" "+"  ");

                        } else if (j==27 && i==4 || j == 29 && i == 4) {
                            System.out.print(" "+"  ");

                        }
                        else if (j==28 && i == 5) {
                            System.out.print(" "+"  ");

                        }

                        // Y

                        else if(j == 35|j==36 && i == 3 | i == 2|| j == 41 | j == 42 && i == 3 | i ==2 ){
                            System.out.print(" "+"  ");

                        }
                        else if(j == 37 | j == 36 && i == 4 || j==40 | j == 41 && i == 4   ){
                            System.out.print(" "+"  ");

                        }
                        else if (j == 38 | j == 39 && i>4 && i < 8 ) {
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
