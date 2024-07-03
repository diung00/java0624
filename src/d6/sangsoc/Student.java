package d6.sangsoc;

public class Student extends Person{
    private String major;
    public double credit;

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printInfoS(String name, String major, int numOfCredit){
        System.out.println(String.format("%s - %S - %.2f",name, major, numOfCredit));
    }



}
