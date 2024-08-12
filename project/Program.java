package project;

import entities.Book;
import entities.User;
import func.Biblioteca;
import func.Search;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("O que deseja fazer?\n1 - Adicionar livro\n2 - Pesquisar livro por titulo\n3 - Pesquisar livro por autor\n4 - Listar livros disponiveis\n5 - Sair");
            int option = sc.nextInt();
            sc.nextLine(); // Consumo de linha
            Clear.clear();

            switch (option) {
                case 1:
                    bookList.add(Biblioteca.cadastrarLivro());
                    Clear.clear();

                    break;

                case 2:
                    System.out.println("Digite o título do livro:");
                    String title = sc.nextLine();
                    Clear.clear();

                    Search.buscarPorTitulo(title, bookList);
                    System.out.println("O que deseja fazer?\n1 - Editar livro\n2 - Remover livro");

                    switch (sc.nextInt()) {
                        case 1:
                            for (Book b : bookList) {
                                if (b.getTitle().equals(title)) {
                                    Clear.clear();
                                    Biblioteca.editarLivro(b);
                                }
                            }
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Digite o autor do livro:");
                    String autor = sc.nextLine();
                    Clear.clear();

                    Search.buscarPorAutor(autor, bookList);
                    System.out.println("O que deseja fazer?\n1 - Editar livro\n2 - Remover livro");

                    
                    switch (sc.nextInt()) {
                        case 1:
                            for (Book b : bookList) {
                                if (b.getAuthor().equals(autor)) {
                                    Clear.clear();
                                    Biblioteca.editarLivro(b);
                                }
                            }
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Livros disponíveis:");
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                    break;

                case 5:
                    Clear.clear();
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        sc.close();
    }
}