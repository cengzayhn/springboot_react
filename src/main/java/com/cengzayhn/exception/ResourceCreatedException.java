package com.cengzayhn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 201: oluşturuldu
@ResponseStatus(value = HttpStatus.CREATED)
public class ResourceCreatedException extends RuntimeException {


    //parametreli constructor
    public ResourceCreatedException(String message) {
        super(message);
    }
}
