package d6.ex0702;

public class Main {

    public static void main(String[] args) {

        Series series = new Series();
        series.setTitle("book1");
        series.setPage(300);
        series.setAuthor("Diu");
        series.setSubtitle("tieu de phu");
        series.setVolume(3);

        series.printInfo();

        Magazine magazine = new Magazine();
        magazine.setTitle("book2");
        magazine.setPage(350);
        magazine.setYear(2024);
        magazine.setMonth(07);
        magazine.setTopic("chu de");


        magazine.printInfo();

    }
}
