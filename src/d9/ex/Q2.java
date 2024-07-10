package d9.ex;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(isDigit("1234567890"));
        System.out.println(isDigit("12345678a0"));
        System.out.println(isDigit("abcdef"));

    }
    public static boolean isDigit(String word){
        return word.chars()
                .map(c->c - '0')
                .allMatch(data -> data >= 0 && data <= 9);

    }
}
