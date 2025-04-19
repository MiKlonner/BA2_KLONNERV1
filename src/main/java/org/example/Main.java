package org.example;

import org.example.util.DBInitializer;
import org.example.util.JPA;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize database with sample data
            DBInitializer initializer = new DBInitializer();
            initializer.initDatabase();


        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            JPA.close();
        }
    }
}