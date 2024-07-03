package d5.probs;

public class Q0 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(diff(a, b));
    }

    public static int diff(int a, int b){
        int subtract = a-b;
        if (subtract < 0) return -subtract;
        return subtract;
    }
}
