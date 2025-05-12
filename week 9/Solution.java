
import java.io.*;
import java.util.Arrays;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    public static List<List<Long>> breakTheBricks(int bigHits, List<Integer> newtons) {
        int n = newtons.size();
        int[][] bricks = new int[n][2];

        for (int i = 0; i < n; i++) {
            bricks[i][0] = i + 1;  // index
            bricks[i][1] = newtons.get(i);  // newtons
        }

        Arrays.sort(bricks, (a, b) -> Integer.compare(b[1], a[1]));

        long totalHits = 0;
        List<Long> bigHammerHits = new ArrayList<>();
        List<Long> smallHammerHits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (bigHits > 0 && bricks[i][1] > 1) {
                totalHits++;
                bigHammerHits.add((long) bricks[i][0]);
                bigHits--;
            } else {
                totalHits += bricks[i][1];
                smallHammerHits.add((long) bricks[i][0]);
            }
        }

        if (bigHammerHits.isEmpty()) {
            bigHammerHits.add(-1L);
        }
        if (smallHammerHits.isEmpty()) {
            smallHammerHits.add(-1L);
        }

        // Sort bigHammerHits and smallHammerHits
        Collections.sort(bigHammerHits);
        Collections.sort(smallHammerHits);

        List<List<Long>> result = new ArrayList<>();
        result.add(Collections.singletonList(totalHits));
        result.add(bigHammerHits);
        result.add(smallHammerHits);
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        Result result = new Result();


      List  newtons = new ArrayList() ;
        Collections.addAll(newtons,7, 9, 3, 2, 5, 8, 4, 6);
        System.out.println(result.breakTheBricks(9,newtons ));


        String str = "asdds";

        Stream<Character> stream = str.chars().mapToObj(c->(char)c);
//        stream.forEach(x-> System.out.println(x));

        stream.collect(Collectors.toList());

        str.chars().mapToObj(c-> String.valueOf(c))
                .collect(Collectors.toList());
//                .forEach(x-> System.out.println(x+ x instanceof String));

       List<Character> characterList = str.chars()
                .mapToObj(c->(char)c)
                .filter(c-> c == 'd')

                .collect(Collectors.toList());
        System.out.println(characterList);

        String sortedStr = str.chars()
                .mapToObj(x-> (char) x)
                .sorted()
                .map(x-> String.valueOf(x))
                .collect(Collectors.joining());
        System.out.println(sortedStr);


        Map<String, Long> charCount = str.chars()
                .mapToObj(x-> String.valueOf((char) x))

                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
                charCount.entrySet().stream().filter(x->x.getValue() == 1).forEach(x-> System.out.println(x));

        System.out.println(charCount);

        String uniqueChars = str.chars()
                .distinct()
                .mapToObj(x->String.valueOf((char) x))
                .collect(Collectors.joining());
        System.out.println(uniqueChars);
//new LinkedList<>().poll();
    }
}