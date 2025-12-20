package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentID;
import com.example.demo.repository.StudentIDRepo;
import com.example.demo.service.StudentIDService;
@Service
public class StudentIDimpl implements StudentIDService{
        @Autowired StudentIDRepo sid;
    
    @Override
           public StudentID posData(StudentID si){
             return sid.save(si);
         }
}