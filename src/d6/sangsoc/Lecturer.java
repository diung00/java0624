package d6.sangsoc;

public class Lecturer extends Person{

    private String major;
    private int numOfResearch;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getNumOfResearch(int numOfResearch) {
        return numOfResearch;
    }

    public void setNumOfResearch(int numOfResearch) {
        this.numOfResearch = numOfResearch;
    }

    public void printInfo(){
        System.out.println(String.format("%s (강사)- %s", getName(),major));
    }

}