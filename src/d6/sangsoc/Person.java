package d6.sangsoc;

public class Person {
    private String name;
    private int age;

    /*public Person(String name){
        this.name = name;
        this.age = age;

    }*/
    public void getOld (){
       age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
