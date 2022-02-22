package services.impl;

import entities.Book;
import entities.Client;
import services.ClientService;

import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    @Override
    public void takeBooks(Client client, List<Book> books) {
        client.setBooks(new ArrayList<>(books));
    }

    @Override
    public void returnBooks(Client client, List<Book> books) {
        client.getBooks().removeAll(books);
    }
}
