package d6.ex0702;

public abstract class Book {
    private String title;
    private int page;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public abstract void printInfo();
}
