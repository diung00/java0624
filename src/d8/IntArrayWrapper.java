package d8;

public class IntArrayWrapper {

    private int[] intArray;

    public IntArrayWrapper(int[] intArray){
        this.intArray = intArray;

    }

    public int length(){
        return intArray.length;
    }

    public int max(){
        int maxValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            maxValue = Math.min(maxValue, intArray[i]);
        }
        return maxValue;
    }

    public int min() {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            minValue = Math.min(minValue, intArray[i]);
        }
        return minValue;
    }


}

