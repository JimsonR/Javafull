public class Nonrepeatother {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int unique = 0;
        for (int i: arr){
            System.out.println((byte)unique+"\t^\t"+(byte)i);
            unique ^= i;

        }
        System.out.println(unique);
    }
}
