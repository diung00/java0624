package d8.Q5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //HashSet 중복을 없애고

        Set<String> names = new HashSet<>();
        while (true){
            String inputLine = scanner.nextLine();
            if (inputLine.equals("q")){
                break;
            }
            names.add(inputLine);
        }
        // Arraylist으로 정리한다.
        List<String> nameList = new ArrayList<>(names);
        Collections.sort(nameList);
        System.out.println(names);
        Set<String> nameSet = new HashSet<>(names);
        for (String name : nameSet){
            System.out.println(name);
        }
    }
}
