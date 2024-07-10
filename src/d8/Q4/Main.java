package d8.Q4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> integerset = new HashSet<>();
        while(true){

            String inputLine = scanner.nextLine();
            if(inputLine.equals("q")){
                break;
            }

            try{
                integerset.add(Integer.parseInt(inputLine));

            }
            catch(NumberFormatException ignored){}

        }
        int sum = 0;
        for( int inputValue : integerset){
            sum += inputValue;
        }
        System.out.println(integerset.size());
        System.out.println(sum);
    }
}
