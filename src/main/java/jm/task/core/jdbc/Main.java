package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserServiceImpl dataUser = new UserServiceImpl();
        dataUser.createUsersTable();
        dataUser.saveUser("Egor","Vit",(byte)31);
        dataUser.saveUser("Tor","First",(byte)22);
        dataUser.saveUser("Lorf","Virat",(byte)46);
        dataUser.saveUser("Igor","Prat",(byte)84);
        dataUser.getAllUsers();
        dataUser.cleanUsersTable();
        dataUser.dropUsersTable();
    }
}
