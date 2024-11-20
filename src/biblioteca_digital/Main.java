package biblioteca_digital;

public class Main {
    public static void main(String[] args) {
        BibliotecaDigital biblioteca = new BibliotecaDigital();

        biblioteca.adicionarEbook(new Ebook("Eu, robô", "Isaac Azimov", 300));
        biblioteca.adicionarEbook(new Ebook("Eram os deles eles mesmos", "Isaac Azimov", 450));

        biblioteca.adicionarVideo(new VideoDigital("Java com exemplos incríveis", "Giovanni", 30));
        biblioteca.adicionarVideo(new VideoDigital("Vire um mestre do Figma!", "Gustavo", 45));

        BibliotecaUI ui = new BibliotecaUI(biblioteca);
        ui.iniciar();
    }

}
