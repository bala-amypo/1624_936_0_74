package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.PostMapping;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{

  @Autowired StudentService ser;
  @PostMapping("/post")
  public StudentEntity sendData(@RequestBody StudentEntity ent){
      return service.postData(ent);
  }
}