package com.example.CrudRapido.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;


@Data
//
@Entity
//
@Table(name = "tbl_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long StudentId;

    private String StudentName;



}
