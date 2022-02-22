package services;

import entities.Admin;
import entities.Client;

public interface AdminService {
    void ban (Admin admin, Client client);
    void unban(Admin admin, Client client);
}
