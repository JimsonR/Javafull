public class recurbinsrch {
    static int bin(int left, int right, int[] arr,int target) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return mid;
            }
            else if (target > arr[mid]) {
//                c++;
//                System.out.println(c);
                return bin(mid+1, right, arr,target);

            } else if (target < arr[mid]) {
                return bin(left, mid-1, arr, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        bin(0,arr.length-1, arr, 6);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    }
}
