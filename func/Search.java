package func;

import java.util.ArrayList;
import java.util.List;
import func.Biblioteca;
import entities.Book;
import java.util.Scanner;

public class Search {

    public static List<Book> buscarPorTitulo(String titulo, List<Book> list) {
        Scanner sc = new Scanner(System.in);
        List<Book> encontrados = new ArrayList<>();
        for (Book book : list) {
            if (book.getTitle().equalsIgnoreCase(titulo)) {
                encontrados.add(book);
            }
        }
        for (Book b : encontrados) {
            System.out.println(b);
        }
        if (encontrados.size() == 0) {
            System.out.println("Livro não existente");
        }

        return encontrados;
    }

    public static List<Book> buscarPorAutor(String autor, List<Book> list) {
        List<Book> encontrados = new ArrayList<>();
        for (Book book : list) {
            if (book.getAuthor().equalsIgnoreCase(autor)) {
                encontrados.add(book);
            }
        }
        for (Book b : encontrados) {
            System.out.println(b);
        }
        if (encontrados.size() == 0) {
            System.out.println("Autor não existente");
        }
        
        return encontrados;
    }
}
