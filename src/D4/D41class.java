package D4;

import java.util.Scanner;



public class D41class {
    public static void main(String[] args) {
        // lam mot cai scanner moi
        Scanner scanner = new Scanner(System.in);

         // lam mot o to
        Car myCar = new Car();
        Car.count++;
        myCar.name = "Sonata";
        myCar.brand = "Huyndai";
        myCar.fuel = 100;

        Car friendCar = new Car();
        Car.count++;

        friendCar.name = "K5";
        friendCar.brand = "Kia";
        // in ten xe cua toi
        System.out.println(myCar.name);
        // in ten xe cua  ban toi
        System.out.println(friendCar.name);

        myCar.printCarinfo();
        friendCar.printCarinfo();

        int result = myCar.addTwo(10);
        System.out.println(result);

     //    String myStr = "new String object";
        myCar.addFuel(50);
        System.out.println( myCar.drive(100));
        System.out.println(myCar.fuel);

        Car randomCar = new Car();
        Car.count++;

        System.out.println(Car.count);

        randomCar.name = "K3";

        System.out.println(Car.countCars());
        String myStr = "";
        String formatStr = String.format("%d",1);



    }
}
