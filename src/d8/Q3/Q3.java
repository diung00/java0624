package d8.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = new ArrayList<>();
        while (true){
            String inputLine = scanner.nextLine();
            if (inputLine.equals("q")) {
                break;
            }

            try{
                inputList.add(Integer.parseInt(inputLine));
            }
            catch (NumberFormatException e){};

        }

        int sum = 0;
        for (int inputValue : inputList){
            sum += inputValue;
        }
        String output = "";
        for (int i = 0; i < inputList.size(); i++) {
            int inputValue = inputList.get(i);
            output += inputValue;
            if (i != inputList.size() - 1){
                output += " + ";
            }
            else{
                output += " = ";
            }

        }
        output += sum;
        System.out.println(output);



    }

}