package d3;

public class d31Conditional {
    public static void main(String[] args) {

        int year = 2000;
        if (year % 4 == 0) {
            System.out.println("boi cua 4");

            if (year % 100 == 0) {
                System.out.println("boi so cua 100");
            }
            if (year % 400 == 0) {
                System.out.println("boi cua 400");
            }
        }

        int num = 8;

        if (num % 2 != 0){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }

    int current = 7;
    int goal = 9;
    if (goal - current >= 2) {
        System.out.println("take bus");
    }
    else {
        if (goal - current >= 1) {
            System.out.println("take subway");
        }
        else {
            System.out.println("take cab");
        }
    }

    int dust = 62;
    if( dust <= 30){
        System.out.println("good");
    }
    else if (dust <= 80){
        System.out.println("normal");
    }
    else if (dust <= 150){
        System.out.println("bad");
    }
    else {
        System.out.println("very bad");
    }

    int someNum = 0;
        if (someNum == 0){
            System.out.println("someNum is 0");
        }
        else if (10 % someNum == 0) {
            System.out.println("someNum is factor");
        }
        else {
            System.out.println(" someNum is not factor of 10");
        }


        char input ='w';
         if (input == 'w'){
             System.out.println("up");
         }
         else if (input == 's') {
             System.out.println("down");
         }
         else if (input == 'd') {
             System.out.println("right");
         }
         else if (input == 'a') {
             System.out.println("left");
         }

         switch (input){
             case 'w':
                 System.out.println("up");
                 break;

             case 's':
                 System.out.println("down");
                 break;
             case 'd':
                 System.out.println("right");
                 break;
             case 'a':
                 System.out.println("left");
                 break;
             default:
                 System.out.println("not a direction");
         }







    }


    }
