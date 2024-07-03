package d6.sangsoc;

import org.xml.sax.ext.LexicalHandler;

import java.sql.Struct;

public class Mainsangsoc {
    public static void main(String[] args) {
        Person person = new Student();
        person.setName("Alex");
        person.setAge(26);
        if (person instanceof Student){
            ((Student)person).setMajor("abc");
            ((Student)person).setCredit(2.5);
            System.out.println("person is a student");
            System.out.println("major is " + ((Student)person));

        }

        person = new Lecturer();
        person.setName("Brad");
        person.setAge(45);
        System.out.println("person is a lecturer");
        if (person instanceof Lecturer){
            Lecturer lecturer = (Lecturer) person;
            lecturer.setMajor("CSE");
            lecturer.getNumOfResearch(0);
            System.out.println();
            System.out.println();
            lecturer.printInfo();



        }



    }



    }
