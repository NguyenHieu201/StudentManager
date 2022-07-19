package com.example.studentmanager;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private String studentName;
    private int studentCode;
    private String email;
    private String birthday;

    public Student(int studentCode, String studentName, String email, String birthday) {
        this.studentName = studentName;
        this.studentCode = studentCode;
        this.email = email;
        this.birthday = birthday;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
