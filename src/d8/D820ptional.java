package d8;

import java.util.Optional;
import java.util.Random;

public class D820ptional {

    public static void main(String[] args) {
   //     Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt() % 2);
//
//        }

        String target = " not null string";
//        for (int i = 0; i < 10; i++) {
//            if (nullOrString().equals(target))
//                System.out.println("equals");
//            else System.out.println(" not equals");
//        }

        //문자을 일수도, null 일수도 있는값을 들고 있는 클래스
        Optional<String> optionalString = Optional.ofNullable(nullOrString());
        // 만약 nullOfString()의 셜과가 null이 아니라면, isPresent가 true
        if (optionalString.isPresent())
            System.out.println(optionalString.get());
        //아리라면(결과가 null이라면, isEmpty가 true)
        if (optionalString.isEmpty())
            System.out.println("result was null");

    }



    //50%의 확울로 null을 반환하는 메서드
    public static String nullOrString(){
        Random random = new Random();
        if (random.nextInt() % 2 ==0)
            return "not null string";
        return null;
    }
}
