import java.util.Scanner;

public class Qh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int base = n % 10;
        int now = base;

        int count = 0;

        while (true){
            now *= base;
            now %= 10;
            count++;

            if (now == base) {
                break;
            }
        }
        System.out.println(count);
    }
}
