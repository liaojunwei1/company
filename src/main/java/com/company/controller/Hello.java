package com.company.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Hello {
    @RequestMapping(value= "/hello",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String Hello(){
        return "hello";
    }
}
