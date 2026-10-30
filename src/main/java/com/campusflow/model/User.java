package com.campusflow.model;

public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String role;
    static String university = "PATA NAHI";
    public User(String userId, String name, String email, String password, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
