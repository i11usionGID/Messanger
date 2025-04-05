package com.example.messanger.model;

public class User {

    private String id;
    private String name;
    private String lastname;
    private int age;
    private boolean online;

    public User(String id, String name, String lastname, int age, boolean online) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.online = online;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isOnline() {
        return online;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", isOnline=" + online +
                '}';
    }
}
