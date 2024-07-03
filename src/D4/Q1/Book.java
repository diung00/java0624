package D4.Q1;

public class Book {
    public static int count;
    private String title;
    private String author;
    private String bunlyu;
    private int year;

    public Book(
            String title,
            String author,
            int year
    ){
        count++;
        this.title = title;
        this.author = author;
        this.year = year;


    }

    public void setName(String newName){
        this.title = newName;
    }
    public String getName() {
        return title;
    }

    public void setNameAuthor(String newNameAuthor){
        author = newNameAuthor;
    }
    public String getNameAuthor() {
        return author;
    }

    public void setBunlyu(String newBunlyu){
        bunlyu = newBunlyu;
    }
    public String getBunlyu() {
        return bunlyu;
    }

    public void setYear(int newYear){
        year = newYear;
    }
    public int getYear() {
        return year;
    }

    public void printBook() {
        System.out.println(String.format("%s by %s, %d", title, author,year));



    /*public String title;
    public String author;
    public String category;
    public int year;
// 반환 (결과)하는 데이터가 없을 때
    public void printInfo(){
        System.out.println(String.format("%s by %s, %d", title,author,year));
    }*/


    }
}
