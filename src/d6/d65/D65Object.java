package d6.d65;

import d6.d62.Lecturer;
import d6.d62.Person;
import d6.d62.Student;
import d6.d64.Car;
import d6.d64.Ship;

import java.sql.Struct;

public class D65Object {

    public static void main(String[] args) {
        Person alex = new Student();
        alex.setName("alex");
        alex.setAge(25);

        System.out.println(alex);

        Object something = new Lecturer();
        Object something2 = new Car();
        Object someShip = new Ship();

        Person noName = new Student();
        System.out.println(noName.getName());

        System.out.println(noName.getName().toUpperCase());


    }
}
