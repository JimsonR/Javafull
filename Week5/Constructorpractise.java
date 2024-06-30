import java.util.*;

import static java.util.Arrays.compare;

class Blimp{
    int size;
    int no_of_passengers;
//    Blimp(int size, int no_of_passengers){
//        this.size = size;
//        this.no_of_passengers = no_of_passengers;
//
//    }
//    Blimp(Blimp obj){
//        this.size = obj.size;
//        this.no_of_passengers = obj.size;
//    }
//    Object m1(){
//        return 9;
//    }
    private void subbu(){
        System.out.println("P");
    }
}
class Flight extends Blimp{
    void subbu(){
        System.out.println("S");
    }


}
public abstract class Constructorpractise {
    int s;
    Constructorpractise(int s){
          this.s = s;
        }
    //    static void m1(){
//
//        main(new String[]{"asd"});
//
//    }
    public static void main(String[] args) {
        Flight flight = new Flight();
            flight.subbu();
//        new Blimp(new Blimp(9,90000));
//        System.out.println("asdasd");
//        m1();

        for(int i =0;i<10;i++)
            System.out.println(i);
//            System.out.println("sad");
        List<String> asd = new ArrayList();
        asd.add(new String("asd"));
        asd.add("dsa");
        asd.add("asd");

        Collections.sort(asd);





    }
}
