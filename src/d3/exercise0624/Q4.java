package d3.exercise;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 남은 경기
        int s = scanner.nextInt(); // 현재 승점
        int g = scanner.nextInt(); // 목표 승점

        int addscore = g - s;
        int matchNeedInt = addscore / 3;
        double matchNeedDouble = (double) addscore / 3;


        if (matchNeedDouble <= n ) {
            System.out.println(matchNeedInt);

        }
        else{
            System.out.println(s + n * 3);
        }
    }
}
