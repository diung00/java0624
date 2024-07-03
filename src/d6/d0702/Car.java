package d6.d0702;

public class Car {
    private int fuel;

    public void beep() {
        System.out.println("beep");
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int kilos) {
        this.fuel -= kilos / 10;    }
}
