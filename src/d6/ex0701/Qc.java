package d6.ex0701;

public class Qc {
    public static void main(String[] args) {
        System.out.println(caesarCode(10, "ROVVY"));
        System.out.println(caesarCode(5, "BTWQI"));


    }

    public static String caesarCode(int key, String code){

        char[] decoded = new char[code.length()];
        for (int i = 0; i < code.length(); i++) {

            char letter = code.charAt(i);
            letter -= key;
            if (letter< 'A') letter += 26;
            decoded[i] = letter;

        }

       /* String text = "";
        for (char letter : decoded){
            text = text + letter;

        }
        return text;*/

        return String.copyValueOf(decoded);
    }

}
