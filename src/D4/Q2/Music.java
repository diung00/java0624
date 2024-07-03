package D4.Q2;

public class Music {

    private String title;
    private String artist;
    private String album;
    private int time; // (초)

    public Music (
            String title,
            String artist,
            String album,
            int time
    ){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.time = time;
    }

    public void play(){
        System.out.println(String.format("now playing, %s ...", title));
    }

   public void checkDuration(){
       System.out.println(String.format("%s - %d:%d",title, time /60, time % 60));
    }



}
