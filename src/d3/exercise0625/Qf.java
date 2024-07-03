package d3.exercise0625;

import java.util.Scanner;

public class Qf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        int[] temps = new int[3];


        for (int i = 0; i < 3; i++) {
            names[i] = scanner.nextLine();

        }
        for (int i = 0; i < 3; i++) {
            temps[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (temps[i] >= 38) {
                System.out.println(names[i]);
            }
        }


    }}