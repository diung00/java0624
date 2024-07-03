package tmp;

public class Car {

    private String name;
    private String brand;
    private int fuel;

    public Car(
            String name,
            String brand,
            int fuel
    ) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;

    }


    public String getBrand() {
        return brand;
    }

    public int getFuel() {
        return fuel;
    }

    public String getName() {
        return name;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void printInfo() {
        System.out.println(String.format("name : %s, brand : %s, fuel : %d", name, brand, fuel));
    }


}
