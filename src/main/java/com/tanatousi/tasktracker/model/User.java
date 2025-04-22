package com.tanatousi.tasktracker.model;

import jakarta.persistence.*;

import java.util.List;

@Entity // Указывает, что это сущность JPA
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)// Ограничения: уникальность и NOT NULL
    private String username;

     @OneToMany(mappedBy = "user")
     private List<Task> tasks;


}
