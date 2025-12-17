package com.example.demo.service.Impl;
import org.springframework.stereotype.service;
import org.springframework.beans.factory.annotation.Autowrite;
import com.example.demo.entity.StudentEntity;

@Service
public class StudentServiceimpl implements StudentService{
        @Autowired StudentRepo student;
        //save()
        //findAll()
        //findById()
        //deleteById()
        //existById()
         StudentEntity postData(StudentEntity stu){
             return student.save(stu);
         }
}