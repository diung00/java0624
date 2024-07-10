package d8.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
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
        System.out.println(inputList);

        int sum = 0;
        for (String input: inputList) {
            int num = Integer.parseInt(input);
            if (num % 3 == 0) {
            sum += num;
            }
            else continue;

        }
        System.out.println(sum);



    }
}

