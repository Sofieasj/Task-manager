package org.example.task_manager.User;

public class User {
    // initialiser variabler
    int userID;
    String name;
    String email;
    String password;

    // konstruktør
    public User(int userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // gettere og settere:
    // id skal autogenereres av DB - derfor ingen set() ?
    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // legg inn ekstra verifisering
        if (!name.equals("hei")) this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // input verification i frontend, men legg inn sikkerhet her og
        this.email = email;
    }

    // obs - hvordan håndtere passord/login sikkert
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
