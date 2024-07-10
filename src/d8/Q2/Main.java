package d8.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();

            if (input.equals("q")){
                break;
            }
            int inputValue = Integer.parseInt(input);
            if (inputValue % 3 ==0)


            inputList.add(Integer.parseInt(input));
        }
        int sum = 0;
        for (int value : inputList){
            if(value % 3 == 0 ) {sum += value;}

        }
        System.out.println(sum);
    }
}
