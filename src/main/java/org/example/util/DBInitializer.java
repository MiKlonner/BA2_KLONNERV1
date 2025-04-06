package org.example.util;


import org.example.User;
import org.example.UserRepo;

public class DBInitializer {


    private final org.example.UserRepo UserRepo;


    public DBInitializer() {
        this.UserRepo = new UserRepo();
    }

    public void initDatabase() {


        System.out.println("Initializing database...");
      // TODO: 05.04.2025 add crud operations for future implementations
        User user = new User("Michael", "Klonner", "mi.klonner@gmail.com", "1234");
        UserRepo.save(user);




        System.out.println("Database initialized successfully!");
    }
}