package d3.exercise0625;

import java.util.Scanner;

public class Qc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int s  = scanner.nextInt();
        int v2 = scanner.nextInt();
        // sau 10s thi bao chay duoc?
        int slion = v1 * 10;
        int smoi = v2 * 10;
        if ( slion - smoi >= s){
            System.out.println(s / 2 / v2);
        }
        else
            System.out.println("gru gru gru");
    }
}
