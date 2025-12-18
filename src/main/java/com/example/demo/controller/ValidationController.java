package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.ValidationEntity;
@RestController
public class ValidationController{
  @Autowired StudentService va;
  @PostMapping("/post")
  public StudentEntity sendData(@RequestBody ValidationEntity val){
      return va.postData(val);
  }
}