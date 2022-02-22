//Реализуйте класс-наследник AbstractUser под названием Client, дополняющий его следующими полями:
//private Boolean banned
// массив книг, которые он одолжил


package entities;

import java.util.List;

public class Client extends AbstractUser {
    private Boolean banned;
    private List<Book> books;

    public Client(String firstName, String lastName, String middleName, String phone, Boolean banned, List<Book> books) {
        super(firstName, lastName, middleName, phone);
        this.banned = banned;
        this.books = books;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Boolean getBanned() {
        return banned;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

