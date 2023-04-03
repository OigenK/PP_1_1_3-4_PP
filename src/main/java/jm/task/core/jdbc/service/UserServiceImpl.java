package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl daoJDBC = new UserDaoJDBCImpl();
    @Override
    public void createUsersTable() {
    daoJDBC.createUsersTable();
    }
    @Override
    public void dropUsersTable() {
    daoJDBC.dropUsersTable();
    }
    @Override
    public void saveUser(String name, String lastName, byte age) {
    daoJDBC.saveUser(name, lastName, age);
        System.out.println("User c именем - " + name + " добавлен в базу данных");
    }
    @Override
    public void removeUserById(long id) {
    daoJDBC.removeUserById(id);
    }
    @Override
    public List<User> getAllUsers() {
        List<User> users = daoJDBC.getAllUsers();
        for (User user :users) {
            System.out.println(user);
        }
        return users;
    }
    @Override
    public void cleanUsersTable() {
        daoJDBC.cleanUsersTable();
    }
}
