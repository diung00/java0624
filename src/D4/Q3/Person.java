package D4.Q3;

import javax.swing.*;

public class Person {

    private String name;
    private int age;

    public Person(String name){

        this.name = name;
        this.age = 0;

    }
    public void instro(){

        if(age>=5){
            System.out.println(String.format
                    ("Hello, I'm %s", name));
        }
        else {
            System.out.println("응애응애");

        }

    }
    public int age(){
        age++;
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
