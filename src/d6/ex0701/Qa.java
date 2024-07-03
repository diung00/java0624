package d6.ex0701;

public class Qa {

    public static void main(String[] args) {
      addTime(10);
    }

    public static int addTime(int n) {
        int current = 7;
        current += n;
        int s = current % 12;
        if (n >= 0 && n <= 127) {
            if (s == 0) {
                System.out.println(0);
            }
            else {
                System.out.println(s);
            }
        } else {
            System.out.println(-1);

        }
        return s;
    }
}





