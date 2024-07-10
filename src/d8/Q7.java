package d8;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Map<String, String> student = new HashMap<>();

        while (true){
            String input = scanner.nextLine();

            if (input.equals("q")){
                break;
            }

            String[] split = input.split(" ");
            String major = split[0];
            String name = split[1];
            student.putIfAbsent(major, name);
        }

        String output = "";
        Set<String> person = student.keySet();
        for (String key : person){


            output += key;
            output += " ";
            output += student.get(key);
            if (key.equals(key)) continue;
            output += student.get(key);



        }
        System.out.println(output);















    }
}
