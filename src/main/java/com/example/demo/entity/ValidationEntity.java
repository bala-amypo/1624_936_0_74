package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraint.NotNull;
import jakarta.validation.constraint.Size;
import jakarta.validation.constraint.Email;
import jakarta.validation.constraint.Max;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @NotNull
  @Size(min=2,max = 6,message="must be of 2 to 6 characters") 
  private String name;
  @Email(message="Email is not Valid")
  private String email
  @Max(6)
  @NotNull(message="password is mandatory")
  private String password;
  private int age;

}