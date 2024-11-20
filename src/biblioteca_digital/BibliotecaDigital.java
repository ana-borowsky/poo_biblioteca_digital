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
    
    public static void baixar(String item) {
        System.out.println("Baixando " + item + ":");
        download();
    }

    public static void visualizar(String item) {
        System.out.println("Visualizando " + item + ":");
        download();
    }

    public static void download() {
        String barra = "[--------------------]";
        int tamanho = barra.length() - 2;
        System.out.print("[");

        for (int i = 0; i < tamanho; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("\nErro na simulação de download.");
                return;
            }
            System.out.print("=");
        }
        System.out.println("] Concluído!");
    }
}
