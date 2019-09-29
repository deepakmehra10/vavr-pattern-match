package com.deepak.examples;

import java.util.Objects;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

public class PatternMatchWithObject {
    public static void main(String[] args) {
        User user = new User(1, "Deepak");
        User result = Match(user).of(
                Case($((new User(1, "Deepak"))), student -> student),
                Case($(), new User(0, "default")));
    
        System.out.println(result); // User{id=1, name='Deepak'}
    }
}

class User {
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    int id;
    
    String name;
    
    
}
