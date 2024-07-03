package D4;

public class D4test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumArray(numbers));
        int[] numbers2 = {6, 7, 8, 9};
        System.out.println(sumArray(numbers2));
        int[] numbers3 = {22, 33, 44, 55};
        System.out.println(sumArray(numbers3));
    }

    public static int sumArray(int[] numbers){

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;

    }
   /* System.out.println(sum);

    int[] numbers3 = {113, 124, 555, 23};
    sum = 0;

    for (int i = 0; i < numbers3.length; i++){

    }*/
}

