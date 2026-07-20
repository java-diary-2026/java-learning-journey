package com.studentsystem;

public class User {
    private String username;
    private String userpassword;
    private String personid;
    private String phonenumber;

    public User() {
    }

    public User(String username, String userpassword, String personid, String phonenumber) {
        this.username = username;
        this.userpassword = userpassword;
        this.personid = personid;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
