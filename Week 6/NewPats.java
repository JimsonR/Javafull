import java.util.Arrays;

public class NewPats {
    String[] i() {
        String[] s = new String[10];
        for (int i = 0; i < 10; i++) {
            s[i] = "";
            for (int j = 0; j < 10; j++) {
                if (j == 4 | j == 5  && i > 1 && i < 9) {
//                System.out.print("*"+" ");
                    s[i] += "* ";
                } else if (j< 8 && j > 1 && i == 2 | i == 3 | i == 7 | i == 8) {
                    s[i] += "* ";


                } else {

//                System.out.print(" ");
                    s[i] += "  ";

                }


            }

//        System.out.println();
//            s += "\n";

        }
        return s;
    }
    String[] t() {
        String[] s = new String[10];
        for (int i = 0; i < 10; i++) {
            s[i] = "";
            for (int j = 0; j < 10; j++) {
                if (j == 4 | j == 5 && i > 1 && i < 9) {
//                System.out.print("*"+" ");
                    s[i] += "* ";
                }
                else if (j > 1 && j < 8 && i == 2 | i == 3 ) {
                    s[i] += "* ";
                } else {

//                System.out.print(" ");
                    s[i] += "  ";

                }


            }

//        System.out.println();
//            s += "\n";

        }
        return s;
    }

    public static void main(String[] args) {
////        System.out.println(Arrays.toString(new NewPats().i()));
//        for(int i = 0 ; i<new Patternsstar().m().length; i++){
//            System.out.println(new Patternsstar().J()[i]+new NewPats().i()[i]+new Patternsstar().m()[i]+new Patternsstar().m()[i]+" "+ new Patternsstar().y()[i] );
//        }

        String out = "";

//        for(int i = 0 )

//B
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if(j == 1 && i >1 & i < 9 || j==2 && i >1 & i < 9 ){
//                    System.out.print("* ");
//                }
//                else if (j>2 && j<8 && i == 2 | i == 3) {
//                    System.out.print("* ");
//                }
//                else if (j == 7 && i >1 & i < 9 || j==8 && i >2 && i < 8 && i != 5 ) {
//                    System.out.print("* ");
//                }
//                else if (j>2 && j<8 && i == 7 | i == 8 ) {
//                    System.out.print("* ");
//                }
//                else if (j>2 && j<8 && i == 5) {
//                    System.out.print("* ");
//                } else{
//                    System.out.print("  ");
//                }
//
//
//
//            }
//            System.out.println();
//        }

        // U
//        for(int i = 0;i < 10 ; i++ ){
//            for(int j = 0 ; j<10 ; j++){
//                if(j == 1 | j == 2 | j== 8 | j==7 && i>1 && i<8){
//                    System.out.print("* ");
//                }
//                else if (j > 1 && j < 8 && i == 7 | i == 8 ) {
//                    System.out.print("* ");
//                }
//                else{
//
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // S
        for(int i = 0; i<10; i++){
            for(int j=0; j<10; j++){
                if(j > 0 && j<9 && i == 1 | i==2 | i == 4 | i==5 | i == 7 | i == 8 ){
                    System.out.print("* ");
                }
                else if(j == 1 | j == 2 && i == 3 ){
                    System.out.print("* ");
                }
                else if (j == 7 | j == 8 && i == 6) {
                    System.out.print("* ");

                } else{
                    System.out.print("  ");
                }


            }

            System.out.println();
        }

    }
}

