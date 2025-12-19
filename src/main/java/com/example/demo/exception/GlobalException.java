package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.framework.web.bind.annotation.ResponseEntity;
import com.example.demo.exception.ValidationException;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationexception(ValidationException ex){
        return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
    }

}