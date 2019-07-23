package com.gameshop.entity;

public class User {
    private Integer id ;
    private String name ;
    private Integer money;
    private String password;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, Integer money, String password) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Integer getMoney() {
        return money;
    }

    public String getPassword() {
        return password;
    }
}
