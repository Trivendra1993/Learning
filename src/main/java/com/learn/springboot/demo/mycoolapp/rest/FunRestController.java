package com.learn.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
import java.lang.*;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"


    @Value("${my.name}")
    private static String myname1 ="d";

    @GetMapping("/")
    public String sayHello(){
        return myname1;
    }

    public static void main(String[] args){
        System.out.println(myname1);
    }


}
