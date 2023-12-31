package com.cengzayhn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// api yakalanması icin
// 401 : yetkisiz giriş exception
@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class ResourceAuthorizedException extends RuntimeException {

    //parametreli constructor
    public ResourceAuthorizedException(String message) {
        super(message);
    }
}
