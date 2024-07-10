package d7.Q3;

public class MicroWave implements CookingUtensil, Switchable{

    private boolean onOff;

    @Override
    public void hitSwitch() {
        onOff = !onOff;
    }

    public void utensil(){
        if (!onOff)
            throw new RuntimeException(("microwavw is not on"));
        System.out.println("now start cooking...");
    }

}
