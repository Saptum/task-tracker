    package com.tanatousi.tasktracker.model;

    import jakarta.persistence.*;

    import java.util.List;


    @Entity
    public class TaskCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Task> tasks;



}
