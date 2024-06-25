package d3.exercise;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input > 0){
            System.out.println("positive");
        }
        else if (input == 0){
            System.out.println("0");
        }
        else {
            System.out.println("negative");
        }
    }
}
