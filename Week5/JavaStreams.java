import java.util.*;
import java.util.stream.Stream;

public class JavaStreams {
     static int i = 0;
    public static void main(String[] args) {
        System.out.println(i);
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
        generates.limit(4).forEach(System.out::println);
//        Stream stream1 = new() {
//        };
           Stream<Integer> streams2 = streams.sorted();
           Stream<Integer> streams3 = streams2.map(x->x*x).map(x->x*x);

//                    .toList()
                     streams2
                            .map(x-> x*x)
                                .forEach(x->{
                                             System.out.println(x);
                                            });
//        System.out.println(stream.count());


    }
}
