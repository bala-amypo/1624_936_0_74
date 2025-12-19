package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStamp;
import java.util.List;
@RestController
public class TimeStampController{
  @Autowired TimeStampService ts;
  @PostMapping("/p")
  public TimeStamp sendData(@RequestBody TimeStamp Tim){
      return ts.posData(Tim);
  }
  }