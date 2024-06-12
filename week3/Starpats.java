public class Starpats {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            for(int y = 0; y < 10-x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
