package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationexception(ValidationException ex){
        return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
    }

}