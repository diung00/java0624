package d5;

import D4.Q3.Person;

public class D51Methods {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
       /* int sum = addTwo(a, b);
        System.out.println(sum);*/

        int c = 20;

        int result = diff(addTwo(b,c), subTwo(a,b));

        System.out.println(result);
        System.out.println(String.format("Sum: %d", result));
        int[] numbers = {1,2,3,4,5};
        System.out.println(sumIntArray(numbers));

        String str = " xin chaof";
        int n = 5;
        printNTime ("hello", 5);
        printNTime("xin chafo", 10);

        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2030));

    }


    // cho 1 nam, xac dinh xem thang 2 co 29 ngay hay khong?
    public static boolean isLeapYear(int year){

        if (year % 4 == 0){
            if(year % 100 == 0 && year % 400 != 0){
                return false;
            }

                return true;
        }
        else {
            return false;
        }
    }




    public static int addThree(int a, int b, int c){
        return a + b + c;
    }
    public static int sumIntArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void readPerson(Person tooi) {
        tooi.instro();
    }
    //특정 문자열(str)을 n번 반복해서 출력하는 메서드
    public static void printNTime(String str, int n){
        for ( int i = 0; i < n; i++){
            System.out.println(str);
        }
    }


    public static int negative(int number){
        return -number;
    }



        public static int diff ( int a, int b ){
            int diff = a - b;
            if (diff < 0) diff *= -1;
            return diff;
        }

        public static int subTwo( int a, int b){
            return a - b;
        }

        public static int addTwo ( int a, int b){
       /* int c = a;
        int temp = b;
        b = c;
        int sum = a + b;*/
            return a + b;
        }
}
