package d3.exercise;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int plus = 0;

        for (int i=1; i<=n; i++){
            int num = scanner.nextInt();
            plus = plus + num;
        }
        System.out.println(plus);



       /* int n = scanner.nextInt();
        int plus = 0;
        int numOfinput = 1;

        while (numOfinput <= n) {
            int num = scanner.nextInt();
            plus = plus + num;
            numOfinput++;

        }
        System.out.println(plus);*/

    }
}
