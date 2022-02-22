package controller.impl;

import controller.LibraryAPIService;
import entities.Admin;
import entities.Book;
import entities.Client;
import services.AdminService;
import services.ClientService;

import java.util.List;

public class LibraryAPIServiceImpl implements LibraryAPIService {
    private final AdminService adminService;
    private final ClientService clientService;

    public LibraryAPIServiceImpl(AdminService adminService, ClientService clientService) {
        this.adminService = adminService;
        this.clientService = clientService;
    }

    @Override
    public void ban(Admin admin, Client client) {
        adminService.ban(admin, client);
    }

    @Override
    public void unban(Admin admin, Client client) {
        adminService.unban(admin, client);
    }

    @Override
    public void takeBooks(Client client, List<Book> books) {
        if (client.getBanned()) {
            System.out.printf("Client %s can't take books because he's banned\n", client.getPhone());
        }
        else {
            clientService.takeBooks(client, books);
            System.out.printf("Client %s take books %s\n", client.getPhone(), books);
        }
    }

    @Override
    public void returnBooks(Client client, List<Book> books) {
        clientService.returnBooks(client, books);
        System.out.printf("Client %s returned books %s\n", client.getPhone(), books);
    }
}
