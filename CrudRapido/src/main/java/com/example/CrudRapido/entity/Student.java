package com.example.CrudRapido.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;


@Data
@Entity
@Table(name = "tbl_student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long StudentId;

    @Column
    private String name;

    @Column(unique = true , nullable = false)
    private String email;

    @Column
    private String facultad;



}
