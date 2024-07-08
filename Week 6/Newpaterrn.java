public class Newpaterrn {
    public static void main(String[] args) {
        for(int i = 0 ; i < 20 ; i++ ){
            for(int j = 0 ; j < 20 ; j++){
                if(j == 10 - i ) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
                }
            System.out.println();
        }
    }
}
