package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class ValidationController{
  @Autowired ValidationService va;
  @PostMapping("/post")
  public ValidationEntity sendData(@Valid @RequestBody ValidationEntity val){
      return va.postData(val);
  }
}
