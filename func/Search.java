package func;

import java.util.ArrayList;
import java.util.List;

import entities.Book;
import java.util.Scanner;

public class Search {
    public static List<Book> buscarPorTitulo(String titulo, List<Book> list) {
        List<Book> encontrados = new ArrayList<>();
        for (Book book : list) {
            if (book.getTitle().equalsIgnoreCase(titulo)) {
                encontrados.add(book);
            }
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
        return encontrados;
    }
}
