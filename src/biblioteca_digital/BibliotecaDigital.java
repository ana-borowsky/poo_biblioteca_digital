package biblioteca_digital;

import java.util.ArrayList;

public class BibliotecaDigital {
    private ArrayList<Ebook> ebooks;
    private ArrayList<VideoDigital> videos;

    public BibliotecaDigital() {
        ebooks = new ArrayList<>();
        videos = new ArrayList<>();
    }

    public void adicionarEbook(Ebook ebook) {
        ebooks.add(ebook);
    }

    public void adicionarVideo(VideoDigital video) {
        videos.add(video);
    }

    public ArrayList<Ebook> getEbooks() {
        return ebooks;
    }

    public ArrayList<VideoDigital> getVideos() {
        return videos;
    }

    public boolean temEbooks() {
        return !ebooks.isEmpty();
    }

    public boolean temVideos() {
        return !videos.isEmpty();
    }

    public Ebook getEbook(int index) {
        return (index >= 0 && index < ebooks.size()) ? ebooks.get(index) : null;
    }

    public VideoDigital getVideo(int index) {
        return (index >= 0 && index < videos.size()) ? videos.get(index) : null;
    }
   
}
