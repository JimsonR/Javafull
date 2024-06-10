public class Nonrepeat {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            int count =1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }

    }
}
