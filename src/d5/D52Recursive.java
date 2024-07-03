package d5;

public class D52Recursive {

    public static void main(String[] args) {
        System.out.println(factLoop(6));
    }
    // 밥법1: 반복문을 사용한다

    public static int factLoop(int n){
        int result = 1;
        for (int i = 1; i < n+1; i++){
            result *= i;
        }
        return result;
    }

    // 밥법2: f(n) = n * f(n-1)
    public static int factRecur(int n){
        if (n<2) return 1;
        else {
            int result = n * factRecur(n-1);
            return result;
        }
    }

    public static int fibo(int n){

        if (n==0) return 0;
        if (n<3) return 1;
        return fibo(n-2) + fibo(n-1);
    }





}
