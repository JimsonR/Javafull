import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Jims{
   private static int m = 0;
    {
        System.out.println(new JimsInn().m1);
    }
    class JimsInn{

        int m1 = 0;
        {
            System.out.println(m);
        }
    }
    private static class PrivJim{
    static int i = 19;
        {
            new PrivJim();
        }
        PrivJim(){
            System.out.println("PrivJim");
        }
    }
    static class JimStatic{
        {
            System.out.println(m);
        }
    }
      int i;


     {
        int i;

       System.out.println();

    }
}
public class JavaStreams extends Jims {
  static   {
//        System.out.println(new Jims().m);
}
     static int i = 0;
    public static void main(String[] args) {
//        System.out.println(i);
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5,53,22,44);
//        list.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashMap<Integer, Integer> map = new HashMap<>();
//        Stream<Integer> streamer = new ;

        Stream<Integer> streams= list.stream();
        Random random = new Random();
        Stream<Integer> randomStream = Stream.generate(random::nextInt);
        randomStream.limit(10).max(Comparator.naturalOrder());
        Stream<String> generates = Stream.generate(()->"Hello");
//        generates.limit(4).forEach(System.out::println);
//        Stream stream1 = new() {
//        };
           Stream<Integer> streams2 = streams.sorted();
           Stream<Integer> streams3 = streams2.map(x->x*x).map(x->x*x);

//                    .toList()
//                     streams2
//                            .map(x-> x*x)
//                                .forEach(x->{
//                                             System.out.println(x);
//                                            });
//        System.out.println(stream.count());

        List<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1,2,3,4,5,6,7,8,9);
        Set<Integer> arrayList1 = new HashSet<>();
        Collections.addAll(arrayList, 1,2,3,4,5,6,7,8,9);


//        List<Integer> list1 = arrayList.stream().collect(Collectors.toList());
//        Set<Integer> set = arrayList.stream().collect(Collectors.toSet());

//        System.out.println(set);
        List<String> strings = Arrays.asList("Jyoths", "Jyothiks", "Subbs","Jimss");

        Set<String> set = strings.stream().collect(Collectors.toSet());

        Map<String,Integer> maps = strings.stream().collect(Collectors.toMap(key->key, value->value.length()));

float d1 =  10.f;
float d2 =  0.f;

        System.out.println(d1/d2);


        System.out.println(maps);


    }
}
