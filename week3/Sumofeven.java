public class Sumofeven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int i = 0;
        int sum = 0;

        while(i< arr.length){
            if(i % 2 == 0){
                sum += i;
                System.out.println(sum);
            }
            i = i+2;
        }
        System.out.println(sum);
        for(int j = 0; j < n; j=j+2){}
    }
}
