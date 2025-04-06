package org.example;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "users")
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String surName;
    private Date dateOfBirth;
    private String email;


    private String password;


    public User() {

    }

    public User(String firstName, String surName, Date dateOfBirth, String email, String password) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
    }

    public User(String firstName, String surName, String email, String password) {
        this.firstName = firstName;
        this.surName = surName;this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}