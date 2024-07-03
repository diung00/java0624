package d6.ex0702;

public class Magazine extends Book{

    private int year;
    private int month;

    private String topic;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void printInfo() {
        System.out.println(String.format(
                "%s - %d - %d - %d - %s",
                getTitle(),getPage(),
                year, month, topic
        ));

    }
}
