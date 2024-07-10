package d8.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
         while (true){
             String input = scanner.nextLine();
             if (input.equals("q")){
                 break;
             }
             inputList.add(input);
         }

         for (String input : inputList){
             System.out.println(input);
         }
    }
}
