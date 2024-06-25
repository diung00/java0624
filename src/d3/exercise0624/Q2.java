package d3.exercise;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();



            if (input1 == 0) {
                int input2 = scanner.nextInt();
                double changeinch = (double) input2 / 2.54;

                System.out.println(String.format(input2 + "cm = %.2f inch", changeinch));
            } else if (input1 == 1) {
                int input2 = scanner.nextInt();
                double changecm = (double) input2 * 2.54;

                System.out.println(String.format(input2 + "inch = %.2f cm", changecm));
            } else {
                System.out.println("다시 입력해주세요!");
            }

        }



}
