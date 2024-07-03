package D4;

public class D42class {
    public static void main(String[] args) {


        Car newMyCar = new Car();
        newMyCar.name = "K7";
        newMyCar.brand = "Kia";
        newMyCar.printCarinfo();

        newMyCar.name = "E-class";
        newMyCar.brand = "Benz";
        newMyCar.printCarinfo();


        // khong duoc tu y doi ten va hang xe!

        Car1 myCar = new Car1();
        myCar.setFuel(100);
        myCar.setFuel(-1);


    }
}