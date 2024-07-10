package d9;

import d6.ex0702.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D92Stream {
    public static void main(String[] args) {

        Stream<String> stream;
        String[] nameArray = {"eric", "alex", "dave", "chad"};

        Stream<String> strStream = Arrays.stream(nameArray);
        strStream.forEach(System.out::println);

        int[] numbers = {1, 23, 14, 22, 15, 10, 6};

        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(System.out::println);

        Boolean[] bools = {true, false, true};
        Stream<Boolean> boolStream = Arrays.stream(bools);

        IntStream charStream = "diu@gmail.com".chars();
        charStream.forEach(c -> System.out.println((char) c));

        List<String> nameList = new ArrayList<>();
        nameList.add("alex");
        nameList.add("dave");
        nameList.add("chad");
        nameList.add("brad");
        Stream<String> listStream = nameList.stream();











    }
}
