package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.TimeStamp;
import com.example.demo.repository.TimeStampRepo;
import com.example.demo.service.TimeStampService;
@Service
public class StudentIDimpl implements TimeStampService{
        @Autowired TimeStampRepo Tim;
    
    @Override
           public TimeStamp posData(TimeStamp ts){
             return Tim.save(ts);
         }
}