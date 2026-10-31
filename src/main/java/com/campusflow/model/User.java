package com.campusflow.model;

public class User {
    private final String userId;
    private String name;
    private String email;
    private String password;
    private String role;
    public static final String UNIVERSITY = "PATA NAHI";

    //constructors for registration
    //1.
    public User(String userId,String name){

        this(userId, name, null, null, null);
        // setName(name);
        // this.userId = userId;
       // System.out.println("User registered with userId : " + this.userId + " and name : " + this.name);
    }
    //2.
    public User(String userId, String name, String email){
        this(userId, name, email, null, null);
        // setName(name);
        // this.userId = userId;
        // // this.name = name;
        
        // this.email = email;
        // this.password = password;
        //System.out.println("User registered with userId : " + this.userId + " and name : " + this.name + " and email : "+this.email);

    }

    public User(String userId, String name, String email, String password, String role) {
        setName(name);
        setEmail(email);
        this.userId = userId;
        // this.name = name;
        
        
        this.password = password;
        this.role = role;
    }
    public String getName(){
        return this.name;
    }
    //throws key word used for check exception may arise --> declaration 
    public void setName(String name) {
        if( name==null ||name.isBlank()){
            // System.out.println("Name cannot be empty or Null");
            throw new IllegalArgumentException("Name cannot be empty or Null");
            // return;
        }
        this.name = name;
    }
    public String getUserId(){
        return this.userId;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        if (email==null){
             this.email = email;
        }
        else if(email.isBlank() || !email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException("Email cannot be empty or Null");
        }
        else{
            this.email = email;
        }
    }


}

