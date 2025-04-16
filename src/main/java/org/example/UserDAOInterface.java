package org.example;

import java.util.List;


public interface UserDAOInterface {


    boolean save(User user) throws RuntimeException;


    User updateUserByID(int id, String attribute, String value) throws RuntimeException;


    User deleteUserbyID(int id);


    User findUserByID(int id);


     List<User> findAllUsers();


     List<String> uploadCSV(String filePath) throws RuntimeException;
}
