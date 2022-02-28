/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ASUS
 */
import ConnectUser.UserDao;
import java.sql.SQLException;
import java.util.List;
import Model.User;

public class UserService {
    private UserDao userDao;
    
    public UserService() {
        userDao = new UserDao();
    }
    
    public List<User> getAllUsers() throws SQLException {
        return userDao.getAllUsers();
    }
}


