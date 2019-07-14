package com.example.api.junittestcases;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/useraccount")
public class UserRestController {

    @GetMapping("/get")
    public String getUserInfo(){
        return "Hello Hai  hai";
    }

}
