package rin.compani.jpa_db_postgress.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/*Таблица КУРС
поля id -индентификационный номер
title - название курса*/
@Entity
@Data
public class Course {

    /*id курса*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*Название курса*/
    @Column(nullable = false)
    private String title;

    /*Связь таблиц в отношении многие ко многим*/
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();
}
