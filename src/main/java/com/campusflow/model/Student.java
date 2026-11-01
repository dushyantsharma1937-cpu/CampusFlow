package com.campusflow.model;

public class Student extends User{

    //''' student have right to see but not write to set'
    //private String course;
    //private int semester;
    //private String rollNumber;
    //private String enrollmentNumber;

    public Student(String userId , String name){
        super(userId, name);   

        //System.out.println("Student registered with userId : " + this.getUserId() + " and name : " + this.getName());
    }
    public Student(String userId, String name, String email, String password) {
        super(userId, name, email, password, "STUDENT");
        //System.out.println("Student registered with userId : " + this.getUserId() + " and name : " + this.getName() + " and email : "+this.getEmail());
    }
    public String getCourse(){


        //return course ---> later;
    }
    public String getRollNumber(){
        //return this.rollNumber-->later;
    }
    public String getEnrollmentNumber(){
        // return this.enrollmentNumber-->later;
    }
    public int getSemester(){
        //return this.semester-->later;
    }
  
}