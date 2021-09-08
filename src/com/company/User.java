package com.company;


public class User {
    private static  int lastID = 1;
    private int id;
    private String login;
    private String email;
    private String password;

    public User(String login, String email, String password){
        this.id = lastID;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public void stats(){
        System.out.printf("id: %d\nlogin: %s\nemail: %s\npassword: %s\n", id, login, email, password);
    }

    public int getLastID() {
        return lastID;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
