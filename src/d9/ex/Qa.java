package d9.ex;


import java.util.Arrays;

public class Qa {
    public static void main(String[] args) {
        System.out.println(oddEven(new int[]{1,3,5}));
    }
    public static double oddEven(int[] number){
        return Arrays.stream(number)
                .filter(i -> i >= 0 && i % 2 ==0 )
                .average().orElse(0);

    }
}
