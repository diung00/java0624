package d3.exercise;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();

        if (temp < 38 ){
            System.out.println(temp);
        }

        else {
            String symptom = scanner.next();
            System.out.println(String.format("%d, %s", temp, symptom));
        }
    }
}
