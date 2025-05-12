import java.util.*;
import java.util.stream.Collectors;

public class MyStreamsPractise {

    public static void main(String[] args) {

        String s = "aabbbccccddd";
        System.out.println(s.chars());



//        1. Simple Filter and Collect
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);
//        2. Map to Uppercase
        List<String> names1 = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCaseNames = names1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);
//        3. Find First Element
        List<String> list = Arrays.asList("dog", "cat", "bird");

        Optional<String> first = list.stream().findFirst();

        first.ifPresent(System.out::println);

//        4. Sum of Integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
//        5. Grouping Elements
        List<String> animals = Arrays.asList("dog", "cat", "duck", "cow", "donkey");

        Map<Character , List<String>> groupedByFirstLetter = animals.stream()
                .collect(Collectors.groupingBy(animal -> animal.charAt(0)));

        System.out.println(groupedByFirstLetter);
//      6. Sorting a List
        List<String> fruits = Arrays.asList("banana", "apple", "cherry");

        List<String> sortedFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedFruits);

//        7. FlatMap Example
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c","d"),
                Arrays.asList("e", "f")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);
//        1. Using reduce() to Concatenate Strings
        List<String> words = Arrays.asList("Java" , "Streams", "Are" , "Powerful");

        long count = numbers.parallelStream()
                .filter(n -> n%2 == 0)
                .count();
        System.out.println(count);

        List<String> items = Arrays.asList("Pen" , "Book", "Notebook");

        String result = items.stream()
                .collect(Collectors.joining(", ", "[","]"));

        System.out.println(result);

        List<String> names2 = Arrays.asList("John", "Jane", "Jack", "Jill", "Tom", "Tim");

        Map<Character, List<Integer>> groupByFirstLetterLength = names2.stream()
                .collect(Collectors.groupingBy(
                        name -> name.charAt(0),
                        Collectors.mapping(String::length, Collectors.toList())
                ));
        System.out.println(groupByFirstLetterLength);


        List<Person1> people = Arrays.asList(
                new Person1("Alice", "New York" , 30),
                new Person1("Bob", "New York", 25),
                new Person1("Charlie", "Los Angeles", 30),
                new Person1("David", "Los Angeles", 25)
        );

        Map<String , Map<Integer, List<Person1>>> grouped = people.stream()
                .collect(Collectors.groupingBy(
                        person -> person.city,
                        Collectors.groupingBy(person1 -> person1.age)
                ));

        System.out.println(grouped);

        //Finding max/min using streams
        List<Integer> list1 = Arrays.asList(10,20,30,5,15);

        Optional<Integer> max = list1.stream()
                .max(Comparator.naturalOrder());

        max.ifPresent(System.out::println);
        //finding maximum value elegantly

        // Partitioning into True/False

        List<Integer> nums1 = Arrays.asList(1,2,3,4,5,6);

        Map<Boolean, List<Integer>> partitioned = nums1.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitioned);


    }



}
class Person1 {
    String name;
    String city;
    int age;

    Person1(String name , String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}