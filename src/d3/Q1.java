package d3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 10 == 0){
            System.out.println("multiple of 10");
        }
        else if (n % 5 == 0) {
            System.out.println("multiple of 5");
        }
        else if (n % 2 == 0) {
            System.out.println("multiple of 2");
        }
        else {
            System.out.println(" not multiple of 10 nor 5 nor 2");
        }

















    }
}
