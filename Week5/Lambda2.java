import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//functional interface
interface Lambda1{
//    void f(); // abstact & public
}
interface Lambda22{

}
interface Labmbda extends Lambda1,Lambda22{
    static void f1(){

    }
    int show(int x);
//    private void m1(){
//
//    }
//    int print();
}
abstract class Bc implements Labmbda,Lambda1,Lambda22{
    abstract int mag();
}
class Kpa{

}
public class Lambda2 implements Labmbda,Lambda1,Lambda22{
    public int show(int x){
        return x;
    }
    public void f(){

    }
     void f1(){

    }
    public static void main(String[] args) {
        Games game1 = new Games("Anthem", 3);
        game1.display();
//        Runnable r = ()->{
//            for(int i=0; i<10; i++){
//                System.out.println(i);
//            }
//        };
//        r.run();
        Labmbda lambda = (x)->  x*x;
        System.out.println(lambda.show(9));
//        Labmbda sum = Integer::sum;
//        BinaryOperator<Integer> sum1 = Integer::sum;
    }
}
