package com.abhishek.rest.webservices.restfulwebservices.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationBean {
    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
