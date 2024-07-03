package d5.probs;

/*Q4
미세먼지 수치를 입력받고,

0 ~ 30 이면 좋음
31 ~ 80 이면 보통
80 ~ 150 이면 나쁨
151 ~ 이면 매우 나쁨

이라는 문자열을 반환하는 메서드를 작성하시오.*/

public class Q4 {
    public static void main(String[] args) {
        System.out.println(rateDust(90));
        System.out.println(String.format("%s",rateDust(90)));
    }
    public static String rateDust(int dust){
        if (dust <= 30){
            return "good";
        }
        else if (dust <= 80){
            return "normal";
        }
        else if (dust < 150){
            return "bad";
        }
        else {
            return "very bad";
        }

    }



}
