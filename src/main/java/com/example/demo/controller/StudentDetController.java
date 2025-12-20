package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.entity.TimeStamp;
@RestController
public class StudentDetController{
  @Autowired StudentDetailsService ts;
  @PostMapping("/ph")
  public  sendData(@RequestBody StudentDetails det){
      return sd.posData(det);
  }
  }