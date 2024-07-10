package d9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D93usingStream {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("dave");
        nameList.add("chad");
        nameList.add("eric");
        nameList.add("brad");
        nameList.add("alex");
        // 1. tạo stream
        Stream<String> nameStream = nameList.stream();

        // 2. intermediate operations
        // 중간 작업들: stream에 들어가 있는 데이터들에
        // 일관적으로 적용하는 작업을 정의하는 메서드(operations)

       Stream<String> nameStream1 = nameStream
               .filter(name -> name.contains("a"));
               //.filter(name -> name.contains("e"))
               //.filter(name -> name.contains("i"));

        // đổi tên thành in hoa

        Stream<String> nameStream2 = nameStream1
                .map(name -> name.toUpperCase());

        nameStream2.forEach(System.out::println);

        Stream<Integer> nameLengthStream = nameStream2
                .map(name->name.length());

        IntStream lengthStream = nameStream2
                .mapToInt(name-> name.length());

        Stream<String> nameStream3 = nameStream2
                .sorted();


        Stream<String> nameStream4 = nameStream3
                .sorted((name1, name2) -> -name1.compareTo(name2));
        nameStream4.forEach(System.out::println);



        //3. terminal operations
        // 최종 작업: stream의 데이터를 마지막으로 사용






    }
 //   public String foo(String name){}
}
