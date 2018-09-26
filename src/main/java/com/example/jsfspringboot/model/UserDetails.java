package com.example.jsfspringboot.model;

import javax.persistence.*;

@Entity
public class UserDetails {
    @Column(unique = true)
    int id ;
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long rollno;

    public int getId() {
        return id;
    }

    public long getRollno() {
        return rollno;
    }

    public void setRollno(long rollno) {
        this.rollno = rollno;
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

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
