package com.cengzayhn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 404: Not found Exception
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException{


    //parametreli constructor
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
