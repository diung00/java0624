package d6.d0702;

public class D61Extends {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setFuel(100);
        System.out.println(truck.getFuel());
        truck.beep();
        //자동차가 필요한 곳에 트럭을 널어줄 수 있다
        refuel(truck);
        truck.drive(100);
        System.out.println(truck.getFuel());


        Car porter = new Truck();
        porter.beep();


        System.out.println(truck.getLoad());
        truck.addLoad(100);
        System.out.println(truck.getLoad());
        truck.drive(90);

     //   porter.addLoad();
        ((Truck)porter).addLoad(10);



    }

    /*public static void load(Car car){
        car.addLoad(10);
    }*/

    public static void refuel(Car car){
        car.setFuel(100);
    }
}
