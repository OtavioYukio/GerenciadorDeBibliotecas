package func;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Gatherer.Integrator;
import java.util.Random;
import entities.*;

public class Client {
    
    public static User dataUser(List<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        String name = sc.nextLine();
        System.out.print("Id do cliente: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Livro alugado: ");
        String reservedBook = sc.nextLine();
        System.out.println("Tempo de aluguel (dias): ");
        Integer returnDay = sc.nextInt();

        boolean ex = false;

        for (Book b : list) {
            if (b.getTitle() == reservedBook) {
                ex = true;
                break;
            }
            else {
                ex = false;
            }
        }
        if (!ex) {
            System.out.println("Livro não disponivel");
        }

        return new User(name, id, reservedBook, returnDay);
    }
}
