package d9.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(sumofSquare(new int[]{1,2,3,4,5}));
    }
    public static int sumofSquare(int[] numbers){
       /* IntStream numStream = Arrays.stream(numbers);

       IntStream numStream2 = numStream.map(i->i*i);
       return numStream2.sum();*/

       return Arrays.stream(numbers)
               .map(i-> i*i)
               .sum();
    }
}
