//Создайте интерфейс ClientService и реализуйте его классом ClientServiceImpl, содержащий методы:
//void takeBooks(Client client, List<Book> books),
// который добавляет к книгам в поле books клиента книги, переданные в аргументе функции
//void returnBooks(Client client, List<Book> books),
// который убирает книги, переданные в аргументе функции, из поля books клиента

package services;

import entities.Book;
import entities.Client;

import java.util.List;

public interface ClientService {
    void takeBooks(Client client, List<Book> books);
    void returnBooks(Client client, List<Book> books);
}
