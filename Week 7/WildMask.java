import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
abstract  class Abce{
    void m1(){
        System.out.println("m1");
    }
}
public class WildMask extends Object{

 static void printList(List<? extends Number> list){
        for(Number object: list){
            System.out.println(object.getClass());
        }
    }
 static void lowerBoundList(List<? super Integer> list){
for (Object o : list){
    System.out.println(o);
}
 }
    static void unBoundList(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(1.0);
        list.add(2.3);
//        list.add(false);

        new WildMask().printList(list);

        List<? super Number> list1 = new ArrayList<>();

        list1.add(1);

        //        list1.add(new Object());

        List<Object> list21 = new ArrayList<>();

        list21.add(102.22);
        list21.add(false);

        List<Integer> list2 = new ArrayList();

        List<Object> objects = Arrays.asList(new Object() , new double[23], new String(),"asdasd");

        list2.add(1);

        lowerBoundList(list2);
        lowerBoundList(list21);
        lowerBoundList(objects);
        unBoundList(objects);

    }
}
