package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentDetails;
public interface StudentIDRepo extends JpaRepository<StudentDetails,Integer>{
      
}