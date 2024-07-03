package D4.prac;

public class Person {
    // ten dat theo y minh, tuoi = 25,
// thuoc tinh chua ten
    private String name;
    //thuoc tinh chua tuoi
    private int age;

    public Person() {
        age = 25;
    }
// method dat ten vao
    public void setName(String newName) {
        name = newName;
    }
    // method de truy xuat ten ra
    public String getName(){
        return name;
    }
// method de truy xuat tuoi ra
    public int age(){
        return age;
    }

}
