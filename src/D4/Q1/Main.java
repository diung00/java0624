package D4.Q1;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(
                "sach 1",
                "tac gia 1",
               2000);
        /*book1.setName("book 1");
        book1.setNameAuthor("author 1");
        book1.setBunlyu("truyen ngan 1");
        book1.setYear(2000);*/

        book1.printBook();
        book1.count++;

        Book book = new Book(
                "ten sach", "ten tac gia", 2000
        );


    }
}
