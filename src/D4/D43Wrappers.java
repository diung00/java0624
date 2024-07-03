package D4;

import java.time.LocalDateTime;

public class D43Wrappers {
    public static void main(String[] args) {

        int[] intArr = new int[16];
        //배열참조형 객체이기 때문에
        //length와 같은 속성을 가지고 있다.
        System.out.println(intArr.length);


        System.out.println(String.format("%s, %s!!!", "hello", "world"));

        // int or char는 그렣게 없다
        /*int capAInt = 65;
        char capA = capAInt.toChar();*/

        //요건 문자열로 표현된 숫자니다.
        String numStr = "1234";

        // 문자열을 숫자로 바꿔주자!!!
        int number = Integer.parseInt(numStr);
        System.out.println(number*2);
        //원시타입을 감싸서 추가기능을 제공하는 클래스


        //정수객체
        Integer intObj = 16;
        System.out.println(intObj.byteValue());
        System.out.println(intObj.doubleValue());
        System.out.println(Integer.MAX_VALUE);

        //double 객체
        System.out.println(Double.parseDouble("3.141592")*4);

        // long 객체
        Long longObj = Long.parseLong("100000000000000");
        System.out.println(longObj);

        //charater 객체
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('1'));

        //String 객체

        String myStr = "hello, world";
        char[] charArr = myStr.toCharArray();
        for ( char a: charArr){
            System.out.println(a);
        }
        System.out.println();
        System.out.println(myStr.length());
        String[] splitStr = myStr.split("");
        for (String str: splitStr) {
            System.out.println(str);
        }


       // System.out.println(LocalDateTime.now());

        String nextLine = "1 2 3 4 5";
        String[] intStrs =nextLine.split("");
        int sum = 0;
        for (String str: intStrs){
            sum += Integer.parseInt(str);

        }





















    }
}