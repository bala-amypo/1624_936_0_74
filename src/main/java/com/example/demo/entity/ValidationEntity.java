package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraint.NotNull;
import jakarta.validation.constraint.Size;
import jakarta.validation.constraint.Email;
import jakarta.validation.constraint.Max;
import jakarta.validation.constraint.Positive;
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
  @Size(Max=6)
  @NotNull(message="password is mandatory")
  private String password;
  @Max(30)
  @Positive(message="Age must be positive")
   private int age;


   public Long getId() {
    return id;
    }
public void setId(Long id){
    this.id=id;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
public void getAge(){
    return age;
}
public int setAge(int age){
    thisage=age;
}
}
