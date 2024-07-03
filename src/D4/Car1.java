package D4;

public class Car1 {
    private String name;
    private int fuel;

    public Car1() {
        name = "k5";
        fuel = 100;

    }

    public int getFuel() {
       return fuel;
    }

    public void setFuel(int moreFuel) {
        if (!(fuel > moreFuel)) {
            fuel = moreFuel;
        }
    }
    public String getName() {
        return name;
    }
}