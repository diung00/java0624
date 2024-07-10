package d7;

import java.io.File;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class D7ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Integer c = null;

        try{
            System.out.println(divide(a,b));
        }

        catch (ArithmeticException e){ // nếu có vấn đề thì làm lệnh dưới

            System.out.println("sorry, can't do that");
            System.out.println(e.getMessage());

        }

       /* catch (NullPointerException e){
            System.out.println("NPE!!!");
        }*/


        catch(InputMismatchException | NullPointerException ignored){
            System.out.println("something bad has happened");

        }

        // dù chạy try hay catch thì finally vẫn được chạy
        // không dùng finally cũng được
        finally {
            System.out.println("Bye!");
        }

       /* int dividePlusOne = divide(a,b) + 1;
        System.out.println(dividePlusOne);*/
    }
    public static void readFileContents (String filename){
        File file = new File(filename);
        /*Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());*/


    }


    public static void recursive (long n ){
        if ( n == 0) return;
        recursive(n-1);
    }

    public static int divide(int a, int b){
      //  if(b!=0)
            return a / b;
       /* else
            return Integer.MAX_VALUE;*/
    }
}
