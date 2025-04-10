package org.example.util;


import org.example.Role;
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
        User user = new User("Herbert", "Klonner", "mi.klonner@gmail.com", "1234", Role.USER);
        // User user1 = new User("Herbert", "Klonner", "mi.klonner@gmail.com", "1234", Role.USER);

        try{
            UserRepo.save(user);
           // UserRepo.save(user1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //System.out.println(UserRepo.getAllOrderedbyID());



        System.out.println("Database initialized successfully!");
    }
}