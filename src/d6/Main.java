package d6;

public class Main {

    public static void main(String[] args) {
        Truck porter = new Truck("porter");
        System.out.println(porter.getFuel());
        System.out.println(porter.getName());
        porter.drive(10);
        System.out.println(porter.getFuel());

        Car sonata = new Car("sonata");
        System.out.println(sonata.getFuel());
        System.out.println(sonata.getName());
        porter.drive(10);
        System.out.println(sonata.getFuel());


        porter.beep();

        Car optimus = new Truck("optimus Prime");
        System.out.println(String.format("my name is %s",
                optimus.getName()));

        refuel(porter);
        refuel(optimus);
        System.out.println(porter.getFuel());
        System.out.println(porter.getMaxLoad());
      //  System.out.println(sonata.getMaxLoad());

        // doi xe o to thanh xe tai

        ((Truck) sonata).getMaxLoad();
        ((Truck) optimus).getMaxLoad();

        if (sonata instanceof Truck){
            ((Truck) sonata).getMaxLoad();
        }






    }
    public static void refuel(Car car){
        car.setFuel(100);
    }
}
