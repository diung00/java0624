package d6.d62;

public class Lecturer extends Person{
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    // sayHello가 없으면
    public void sayHello(){
        System.out.println(String.format
                ("hello, i'm %s, and I teach %s",
                        getName(),getMajor()));
    }
}
