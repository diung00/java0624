package d3;

import java.sql.SQLOutput;

public class d32loopp {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number: " + numbers[i]);

        }
        for (int number : numbers) {

            System.out.println("number: " + number);
        }

        String[] names = {"alex", "brad", "chad", "dave", "eric"};

        for (String name : names) {
            System.out.println("name: " + name);
        }

        int price = 50;
        int saving = 200;
        for (int i = 0; i < 10; i++) {

            saving -= price;

            if (saving - price < 0) {
                System.out.println("out of money");
                break;

            }
        }

            System.out.println(saving);

        int [] accounts = { 100, 20, -40, 60, -80, 100};
        int sum = 0;
         for ( int account : accounts) {

             if (account < 0) continue;
             sum += account;
         }
        System.out.println("sum: " +sum);

         while (true) {
             for ( int i=0; i<10; i++){
                 while (true){
                     break;
                 }
                 if (i>5){
                     break;
                 }
             }
         }


    }
}
