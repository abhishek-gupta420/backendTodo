package com.abhishek.rest.webservices.restfulwebservices.basic;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin
@RestController
public class BasicAuthenticationController {

//    GET method
    // Uri = /hello-world
//    method - "hello world:"

    //    @RequestMapping (method= RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorld() {
        return new AuthenticationBean("you are authenticated..");
    }

    //    hello-world-bean


}
