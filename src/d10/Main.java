package d10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        while(true){
            System.out.println("name: ");
            String name = scanner.nextLine();
            System.out.println("age: ");
            int age = Integer.parseInt(scanner.nextLine());
            Person person = new Person(name,age);

            people.add(person);
            System.out.println("saved!");
            //hoi xem co them nguoi khong,
            // neu khong thi ket thuc
            System.out.println("add more? [y/n]");
            String hasNext = scanner.nextLine();

            if (hasNext.equals("n")){
                break;
            }
        }
        System.out.println(people);
    }
}
