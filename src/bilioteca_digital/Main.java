package bilioteca_digital;

public class Main {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("Eu, robô", "Isaac Azimov", 300);
        Ebook ebook2 = new Ebook("Fundação", "Isaac Azimov", 1000);

        VideoDigital video1 = new VideoDigital("Introdução ao Java com exemplos incríveis", "Giovanni", 30);
        VideoDigital video2 = new VideoDigital("Vire o mestre do Figma!", "Gustavo", 45);

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        System.out.println("\n--- Ações ---");
        ebook1.baixar();
        ebook2.baixar();

        video1.baixar();
        video1.visualizar();

        video2.baixar();
        video2.visualizar();
    }
}
