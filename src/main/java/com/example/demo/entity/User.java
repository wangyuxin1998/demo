package com.example.demo.entity;

import java.util.Date;

public class User {
    private int userId;
    private String userName;
    private boolean gender;
    private Date birthday;

    public User() {
    }

    public User(int userId, String userName, boolean gender, Date birthday) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
