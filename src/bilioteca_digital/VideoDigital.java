package bilioteca_digital;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    private int duracao;

    public VideoDigital(String titulo, String autor, int duracao) {
        super(titulo, autor);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + getTitulo() + " por " + getAutor() + ", duração: " + duracao + " minutos.";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo: " + getTitulo());
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando o vídeo: " + getTitulo());
    }
}