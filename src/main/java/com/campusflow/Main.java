package com.campusflow;

import com.campusflow.model.User;

public class Main {
    public static void main(String[] args) {

       try {
    User student1 = new User("U101", "   ");
    System.out.println(student1.getName());

} catch (IllegalArgumentException e) {
    System.out.println("Registration failed: " + e.getMessage());
}
        // System.out.println(student1.SetName(""));
        // student1.setName("");

        // student1.setName("Aman");

        // System.out.println(student1.getName());

    }
}