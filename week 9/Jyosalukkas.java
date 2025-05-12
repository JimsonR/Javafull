import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Jyosss{
    protected Jyosss(){

    }
}
interface juju{
    void add();

}
interface  juju1 extends juju{
    void add(int i);
}
public class Jyosalukkas extends Jyosss{
    static int uhu =0;
    Jyosalukkas(){

    }
    public static void main(String[] args) {
        new Jyosalukkas();
        String str = "aabbbcccddd";
    String set =
         Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
         String no=   Arrays.stream(str.split(""))
                 .collect(Collectors.toSet()).stream()
                 .collect(Collectors.joining());
        System.out.println(no);

//        List<Character> str1 = str.chars().
//                mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == 2)
//                .map(Map.Entry :: getKey)
//                .collect(Collectors.toList());
//        System.out.println(str1);
//
//        System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList()));
List<Customer> customers = new ArrayList<>();
        System.out.println(customers.stream().map(customer -> customer.orders.stream()));

    }
}
class Customer {
    int id;
    String name;
    List<Order> orders;

    // constructor, getters, setters
}

class Order {
    int orderId;
    double amount;
    boolean delivered;

    // constructor, getters, setters
}