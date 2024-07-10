package d10.Q1;

import d10.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Music> music = new ArrayList<>();
        System.out.println("Current Music: ");
        for(Music music1: music){
            System.out.println(music1);
        }



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("제목: ");
            String title = reader.readLine();

            System.out.println("앨범: ");
            String album = reader.readLine();

            System.out.println("가수: ");
            String artist = reader.readLine();

            System.out.println("공개일: ");
            String release = reader.readLine();

            Music music1 = new Music(title, album, artist, release);

            music.add(music1);

            System.out.println("저장했습니다!!");

            System.out.println("노래를 추가하시겠습니까? [y/n]");
            String input = reader.readLine();

            if (input.equals("n")) {
                break;
            }
        }
        bufferedWriter(music);
    }



    public static void bufferedWriter(List<Music> music){
        try(FileWriter fileWriter = new FileWriter("music.csv");
            BufferedWriter writer = new BufferedWriter(fileWriter)) {

            for(Music music1 : music){
                StringBuilder lineBuilder = new StringBuilder();

                lineBuilder.append(music1.getTitle()).append('\n');
                lineBuilder.append(music1.getAlbum()).append('\n');
                lineBuilder.append(music1.getArtist()).append('\n');
                lineBuilder.append(music1.getRelease());
                String line = lineBuilder.toString();
                writer.write(line);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("데이터 작성을 위한 파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
    }

    /*public static List<Music> bufferedReader() {
        List<Music> music = new ArrayList<>();
        try (FileReader fileReader = new FileReader("music.csv");
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                music.add(new Music(
                        elements[0],
                        elements[1],
                        elements[2],
                        elements[3]
                ));
            }
        } catch (IOException e) {

            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
//
        return music;
    }

*/




}
