
class Test1{
//     static void m1(){
//        System.out.println("sad");
//
//    }
//    private void m2(){
//        System.out.println("ASd");
//    }

}

public class Abc1 extends Test1{
    void m1(){

    }
    public static void main(String[] args){
        Abc1 abc = new Abc1(){
            void m1(){
                System.out.println("asdasd");
            }
        };


//        abc.m1();
        Integer[] arr = new Integer[10];
        System.out.println(arr[1]);

    }
 }
