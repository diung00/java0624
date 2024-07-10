package d8;

import com.sun.source.doctree.SeeTree;

import java.sql.SQLOutput;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        Map< String, Integer> menu = new HashMap<>();

        menu.put("Americano", 1500);
        menu.put("Capuccino", 2000);
        menu.put("Latte", 2500);
        menu.put("Mocha", 3000);

        Set<String> menu2 = menu.keySet();
        for (String key : menu2){
            System.out.println(key + " "+ menu.get(key));
        }
        System.out.println("order");
        Scanner scanner = new Scanner(System.in);
        System.out.println(menu.get(scanner.nextLine()));


    }
}
