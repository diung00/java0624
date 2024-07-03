package d6.d64;

public class Main {
    public static void main(String[] args) {
        Beeper beeper = new Car();
        makeBeepSound(beeper);
        beeper = new Ship();
        makeBeepSound(beeper);
        beeper = new Airplane();
        makeBeepSound(beeper);


    }

    public static void makeBeepSound(
            Beeper beeper
    ){
        beeper.beep();
    }
}
