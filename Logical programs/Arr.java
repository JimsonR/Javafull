public class Arr {
    public static void main(String[] args) {
        int[] array = {1, 2};

        for (int i = 1; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println("index " + i + ": " + array[i]);
            }

        }
    }
}
