package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@
public class StudentDetails{
    @Id
    @GeneratedValue=(strategy=GenerationType.IDENITY)
    private Integer id;
    private String name;
    private String email;
    private String address;
}