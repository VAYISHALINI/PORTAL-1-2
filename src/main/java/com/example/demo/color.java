package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	  
    private String color="green";
    @GetMapping("/")
    public String getMyFav(){
       return "My favourite color is "+color;
    }
}
