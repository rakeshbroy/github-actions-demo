package com.example.githubactiondemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
  
  @GetMapping("/hello")
  public String hello() {
    return  "Hello from Coder Army! Welcome back";
  }

  @GetMapping("/bye")
  public String bye() {
    return "Bye Bye";
  }

}
