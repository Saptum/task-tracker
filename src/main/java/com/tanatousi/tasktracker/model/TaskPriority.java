package com.tanatousi.tasktracker.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "task_priority")
public class TaskPriority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "priority")
    private List<Task> tasks;


}
