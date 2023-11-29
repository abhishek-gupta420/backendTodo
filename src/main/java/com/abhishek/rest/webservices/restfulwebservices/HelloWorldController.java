package com.abhishek.rest.webservices.restfulwebservices;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin
@RestController
public class HelloWorldController {

//    GET method
    // Uri = /hello-world
//    method - "hello world:"

    //    @RequestMapping (method= RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "<h1>Hello World </h1> <br> Teri Meri Meri Teri Prem Kahani Hai Mushkil. 2 Lafzon me ye bayaan na ho paaye";
    }

    //    hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldName(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
