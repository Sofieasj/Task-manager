package org.example.task_manager.user;

import jakarta.persistence.Entity;

@Entity 
public class User {
    // initialiser variabler
    private Long userId;
    private String name;
    private String email;
    private String password;

    // konstruktør
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // legg inn verifisering i frontend og backend
        if (!name.equals("")) this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // legg inn verifisering i frontend og backend
        this.email = email;
    }

    // obs - hvordan håndtere passord/login sikkert - hashing?
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
