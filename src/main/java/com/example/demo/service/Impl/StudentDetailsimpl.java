package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.TimeStamp;
import com.example.demo.repository.TimeStampRepo;
import com.example.demo.service.TimeStampService;
@Service
public class StudentDetailsimpl implements StudentDetailsService{
        @Autowired StudentDetailsRepo det;
    
    @Override
           public StudentDetails posData(StudentDetails sd){
             return det.save(sd);
         }
}