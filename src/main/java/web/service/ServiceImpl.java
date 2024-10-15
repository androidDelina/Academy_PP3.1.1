package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.UserDAOImpl;
import web.model.User;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    private UserDAOImpl userDAO;

    @Autowired
    public ServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
