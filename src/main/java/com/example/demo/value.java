package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	 @Value("${check.name}")
	    private String Name;
	    @GetMapping("/")
	    public String get()
	    {
	        return "Welcome "+Name;
	    }
}
