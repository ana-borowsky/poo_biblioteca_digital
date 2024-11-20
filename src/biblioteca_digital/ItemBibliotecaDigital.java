package biblioteca_digital;

public abstract class ItemBibliotecaDigital {
    private String titulo;
    private String autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
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

    public abstract String descricao();
}
