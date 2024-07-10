package d9.ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q3 {
    public static void main(String[] args) {
      //  System.out.println("A R".split(" ").length);
        String[] names = {
                "dave",
                "chad bradford",
                "eric malo"
        };
        System.out.println(filterFullNames(names));

    }


    public static List<String> filterFullNames(String[] names){
       return Arrays.stream(names)
               .filter(name -> name.split(" ").length > 1)
               .sorted()
               .toList();




       /* Stream<String> nameStream = Arrays.stream(names);
        nameStream.filter(name -> {
            int length = name.split(" ").length;
            return length > 1;
        });*/

    }
}
