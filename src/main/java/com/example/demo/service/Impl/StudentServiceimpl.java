package com.example.demo.service.Impl;
import org.springframework.stereotype.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import com.example.demo.entity.StudentRepo;
import com.example.demo.entity.StudentService;

@Service
public class StudentServiceimpl implements StudentService{
        @Autowired StudentRepo student;
        //save()
        //findAll()
        //findById()
        //deleteById()
        //existById()
    @Override
           public StudentEntity postData(StudentEntity stu){
             return student.save(stu);
         }
}