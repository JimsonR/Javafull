public class Jyoths {
    public static void main(String[] args) {
        for(int i = 0 ; i<10; i++){
            for(int j = 0 ; j < 10; j++){
              if( j == i | j == 8-i |j == 4| i == 4 |i == 0 | j == 0 | j == 8 | i == 8 && i < 9 && j < 9){
                  System.out.print(" "+ "H" +" ");
              }
              else{
                  System.out.print("   ");
              }


            }
            System.out.println();
        }
    }
}
