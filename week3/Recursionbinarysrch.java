public class Recursionbinarysrch {
     static int binary(int left, int right,int target,int[] arr) {
        int c = 0;
        if(left <= right) {
            int mid = left + right / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]) {
                c++;
                System.out.println(c);
                return binary(mid+1, right, target, arr);

            } else if (target < arr[mid]) {
                return binary(left, mid-1, target, arr);
            }

        }
        return 1;
    }
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7,8,9};
       int res =  binary(0,arr.length-1,4,arr);
        System.out.println(res);
    }
}
