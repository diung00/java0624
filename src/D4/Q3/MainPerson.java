package D4.Q3;

public class MainPerson {
    public static void main(String[] args) {

        Person tooi = new Person("Diung");

        tooi.instro();
         for( int i=0; i<50;i++){
             System.out.println(String.format
                     ("you are now, %d year old", tooi.age()));
         }
        tooi.instro();
        System.out.println(tooi.getAge());
        System.out.println(tooi.getName());

    }
}
