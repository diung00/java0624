package d6.d0702;

public class Truck extends Car{

    private int maxLoad = 100;
    private int load;

    public boolean addLoad(int load){
        if (this.load + load > maxLoad) return false;
        this.load += load;
        return true;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getLoad() {
        return load;
    }
}
