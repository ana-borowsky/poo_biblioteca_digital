package biblioteca_digital;

import java.util.Scanner;

public class BibliotecaUI {
    private BibliotecaDigital biblioteca;
    private Scanner scanner;

    public BibliotecaUI(BibliotecaDigital biblioteca) {
        this.biblioteca = biblioteca;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean menu = true;

        while (menu) {
            imprimeMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
                continue;
            }

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarEbooks();
                    break;
                case 2:
                    listarVideos();
                    break;
                case 3:
                    System.out.println("Obrigada por utilizar a Biblioteca Digital. Até mais!");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção de 1 a 3.");
            }
        }

        scanner.close();
    }

    private void imprimeMenu() {
        String MENU = "\n--- Biblioteca Digital ---"
                + "\n[ 1 ] Listar ebooks"
                + "\n[ 2 ] Listar vídeos Digitais"
                + "\n[ 3 ] Sair"
                + "\nDigite a opção desejada: ";
        System.out.print(MENU);
    }

    private void listarEbooks() {
        System.out.println("\n--- Lista de Ebooks ---");
        if (!biblioteca.temEbooks()) {
            System.out.println("Nenhum ebook disponível.");
        } else {
            int index = 1;
            for (Ebook ebook : biblioteca.getEbooks()) {
                System.out.println("[ " + index + " ] " + ebook.descricao());
                index++;
            }

            System.out.println("[ 0 ] Voltar ao menu principal");
            System.out.print("Escolha um ebook para baixar: ");
            int escolha = scanner.nextInt();

            if (escolha > 0 && escolha <= biblioteca.getEbooks().size()) {
                Ebook ebook = biblioteca.getEbook(escolha - 1);
                BibliotecaDigital.baixar(ebook.getTitulo());
            } else if (escolha == 0) {
                System.out.println("Voltando ao menu principal...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private void listarVideos() {
        System.out.println("\n--- Lista de Vídeos ---");
        if (!biblioteca.temVideos()) {
            System.out.println("Nenhum vídeo disponível.");
        } else {
            int index = 1;
            for (VideoDigital video : biblioteca.getVideos()) {
                System.out.println("[ " + index + " ] " + video.descricao());
                index++;
            }

            System.out.println("[ 0 ] Voltar ao menu principal");
            System.out.print("Escolha um vídeo para baixar ou visualizar: ");
            int escolha = scanner.nextInt();

            if (escolha > 0 && escolha <= biblioteca.getVideos().size()) {
                VideoDigital video = biblioteca.getVideo(escolha - 1);

                System.out.println("\n[ 1 ] Baixar vídeo");
                System.out.println("[ 2 ] Visualizar vídeo");
                System.out.print("Escolha uma opção: ");
                int acao = scanner.nextInt();

                switch (acao) {
                    case 1:
                    	BibliotecaDigital.baixar(video.getTitulo());
                        break;
                    case 2:
                        BibliotecaDigital.visualizar(video.getTitulo());
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } else if (escolha == 0) {
                System.out.println("Voltando ao menu principal...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
