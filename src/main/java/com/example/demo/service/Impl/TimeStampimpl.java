package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.TimeStamp;
import com.example.demo.repository.TRepo;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService{
        @Autowired TimeStampRepo Tim;
    
    @Override
           public TimeStamp posData(TimeStamp ts){
             return Tim.save(ts);
         }