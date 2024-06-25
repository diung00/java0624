package d3;

import java.util.Scanner;

public class d32loop {

    public static void main(String[] args) {
        /*int loan = 1000;
        int monthly = 50;
        int months = 0;

        // if run khi dkien dung
        // while run nhieu lan den khi dkien khong con dung

        while (loan > 0) {
            if (loan < monthly) {
                loan = 0;
            } else {
                loan -= monthly;
                loan *= 1.03;
            }
            System.out.println(String.format("remaining: %d", loan));
            months++;
        }
        System.out.println(months);

        // dem so lan log in

        Scanner scanner = new Scanner(System.in);

        int password = 1234;
        int tries = 0;


        while (tries < 5) {

            System.out.println("input password: ");
            int input = scanner.nextInt();


            if (password == input) {
                System.out.println("log in oke");
                break;
            }
            else {
                System.out.println("failed to log in");
                tries++;

            }

            //for*/

            for (int i = 0; i < 10; i++) {
                System.out.println("i^2 = " + (i*i));
            }

            for (int i = 0; i < 6; i++ ){
                for (int j = 1; j < i; j++){
                    System.out.println("met qua");
                }
                System.out.println();
            }





        }
    }

