//void ban(Client client), переводящий поле banned клиента в статус true
//void unban(Client client), перводящий поле banned клиента в статус false

package services.impl;

import entities.Admin;
import entities.Client;
import services.AdminService;

public class AdminServiceImpl implements AdminService {
    @Override
    public void ban(Admin admin, Client client) {
        client.setBanned(true);
        System.out.printf("admin %s successfully banned client %s\n", admin.getPhone(), client.getPhone());
    }

    @Override
    public void unban(Admin admin, Client client) {
        client.setBanned(false);
        System.out.printf("admin %s successfully unbanned client %s\n", admin.getPhone(), client.getPhone());
    }
}
