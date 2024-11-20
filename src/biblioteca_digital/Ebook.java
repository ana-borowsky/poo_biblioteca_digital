package biblioteca_digital;

public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    private int numPaginas;

    public Ebook(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String descricao() {
        return getTitulo() + " por " + getAutor() + ", " + numPaginas + " páginas.";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook: " + getTitulo());
    }
}