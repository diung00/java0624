package d3.exercise0625;

import java.util.Scanner;

public class Qe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();

         String [] names = new String[n];

         scanner.nextLine();

         for ( int i=0; i<n;i++){
             names[n-i-1] = scanner.nextLine();
         }
         for (String name : names){
             System.out.println(name);
         }

    }
}
