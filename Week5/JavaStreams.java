import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        List<? super Number> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5,53,22,44);
//        list.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Stream<? super Number > stream = list.stream();
//        Stream stream1 = new() {
//        };
            stream.sorted()
                    .toList()
//                      .filter(x-> x>5)
                                .forEach(x->{
                                             System.out.println(x);
                                            });
//        System.out.println(stream.count());


    }
}
