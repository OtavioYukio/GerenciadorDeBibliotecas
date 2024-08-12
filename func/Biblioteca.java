package func;

import entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    public static Book cadastrarLivro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o titulo: ");
        String title = sc.nextLine();
        System.out.print("Digite o nome do autor: ");
        String author = sc.nextLine();
        System.out.print("Digite o genero: ");
        String genre = sc.nextLine();

        return new Book(title, author, genre);
    }

    public static void editarLivro(Book editBook) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O que deseja alterar?\n1 - Titulo\n2 - Autor\n3 - Genero");
        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            editBook.setTitle(sc.nextLine());
        }
        else if (option == 2) {
            editBook.setTitle(sc.nextLine());
        }
        else if (option == 3) {
            editBook.setGenre(sc.nextLine());
        }
        else {
            System.out.println("Opção invalida, tente novamente");
            editarLivro(editBook);
        }
    }

}
