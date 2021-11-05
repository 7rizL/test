package com.example.test;

public class User {
    private Long id;
    private String name;
    private int age;
    private String nickname;

    public User(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }
}
