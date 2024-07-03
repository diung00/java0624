package d6.ex0702;

public class Series extends Book{

    private String author;
    private String subtitle;
    private int volume;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println(String.format(
                "%s - %d - %s - %s - %d",
                getTitle(),getPage(),
                author, subtitle, volume
        ));

    }
}
