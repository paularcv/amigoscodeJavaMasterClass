package com.amigoscode.classesAndObjectsII;

import java.util.Date;

public class QuestionPerson {
    private String name;
    private String email;
    private Date dob;

    public QuestionPerson(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
