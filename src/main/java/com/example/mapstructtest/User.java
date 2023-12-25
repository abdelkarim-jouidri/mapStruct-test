package com.example.mapstructtest;

public class User {
    private Integer id;
    private String fname;
    private String lname;
    private String password;

    public User(Integer id, String fname, String lname, String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
