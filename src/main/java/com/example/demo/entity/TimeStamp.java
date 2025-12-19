package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @PrePersist
    public void Oncreate(){
    LocalDateTime now=new LocalDateTime.now();
        this.createdAt=now;
        this.updatedAt=now;
    }
    @PreUpdate
    public void Onupdate(){
    LocalDateTime now=new LocalDateTime.now();
     this.updatedAt=now;
    }
}