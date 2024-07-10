package d9.ex;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Qb {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(array1("1 2 3 4 5")));

     //   System.out.println(Arrays.toString());


    }

    public static int[] array1(String number){
        return Arrays.stream(number.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


    }
}
