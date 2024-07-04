interface Test{
     static void m1(){
        System.out.println("sad");

    }
}
public class Abc implements Test{
    public static void main(String[] args){
        Test abc = new Abc();
        Test.m1();
        Integer[] arr = new Integer[10];
        System.out.println(arr[1]);

    }
 }
