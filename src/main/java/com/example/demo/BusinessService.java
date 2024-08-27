package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BusinessService {


    public HelloWord getHelloWorld(){
        HelloWord hw = new HelloWord();
        return hw;
    }

}
