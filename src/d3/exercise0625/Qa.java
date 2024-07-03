package d3.exercise0625;

import java.util.Scanner;

public class Qa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i=0; i<5; i++) {
            int score = scanner.nextInt();
            sum += score;

        }
        double dtb = (double) sum / 5;
        if (dtb >= 80){
            System.out.println("good job");
        }
        else {
            System.out.println("too bad");
        }




   }
}
