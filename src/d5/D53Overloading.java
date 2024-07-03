package d5;

public class D53Overloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a,b);

        long c = 15L;
        long d = 25L;
        long longSum = add(c,d);


        System.out.println(sum);
        System.out.println(longSum);


    }
    public static int add(int a, int b){
        return a+b;
    }
    public static long add(long a, long b){
        return a+b;
    }

}
