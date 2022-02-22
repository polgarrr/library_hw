import controller.LibraryAPIService;
import controller.impl.LibraryAPIServiceImpl;
import entities.Admin;
import entities.Book;
import entities.Client;
import services.AdminService;
import services.ClientService;
import services.impl.AdminServiceImpl;
import services.impl.ClientServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        AdminService adminService = new AdminServiceImpl();
        ClientService clientService = new ClientServiceImpl();

        LibraryAPIService libraryAPIService = new LibraryAPIServiceImpl(adminService, clientService);

        Client client = new Client("Иван", "Иванов", "Иванович", "7999999999", false, new ArrayList<>());
        Admin admin = new Admin("Админ", "Админов", "Админович", "799999999");

        Book onegin = new Book("Евгений Онегин", "Пушкин A.C.");
        Book brothersKaramazovs = new Book("Братья Карамазовы", "Достоевский Ф.М.");

        List<Book> books = new ArrayList<>();
        books.add(onegin);
        books.add(brothersKaramazovs);

        libraryAPIService.ban(admin, client);

        libraryAPIService.takeBooks(client, books);

        libraryAPIService.unban(admin, client);

        libraryAPIService.takeBooks(client, books);
        System.out.println(client.getBooks());

        libraryAPIService.returnBooks(client, books);
        System.out.println(client.getBooks());
    }
}
