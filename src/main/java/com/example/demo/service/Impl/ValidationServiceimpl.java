package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
@Service
public ValidationServiceimpl implements ValidationService{
  @Autowired ValidationRepo validate;
  @Override
   public ValidationEntity postData(ValidationEntity val){
             return validate.save(val);

}