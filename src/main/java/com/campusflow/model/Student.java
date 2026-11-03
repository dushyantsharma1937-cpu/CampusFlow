package com.campusflow.model;

public class Student extends User{

   

    public Student(String userId , String name){
        this(userId, name,null, null);   

    }
    public Student(String userId, String name, String email, String password) {
        super(userId, name, email, password, "STUDENT");
        
    }

    @Override 
    public void displayProfile(){
        System.out.println("------------Student Profile----------------");
        super.displayProfile();
        System.out.println("Role : " + "STUDENT");
    }
    
    @Override
    public void showDashboard(){
        System.out.println("Welcome to Student Dashboard");
    }


    
    
  
}