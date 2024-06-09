package com.test.thymeleaf.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/about")
    public String sayHello(Model model) 
    {
        // List<String> list = List.of("Hello", "from", "MyController", "List", "of", "Strings", "in", "Java");
        // model.addAttribute("message", "Hello from MyController");
        // model.addAttribute("author", "Hello from MyController 2");
        // model.addAttribute("list", list);
        // System.out.println("Hello from MyController");
        // model.addAttribute("isActive", true);
        // model.addAttribute("gender", "M");
        // model.addAttribute("title", "Spring Boot + Thymeleaf");
        return "about";
    }
    @GetMapping("/aboutnew")
    public String newAbout(Model model) {
        return "aboutnew";
    }
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
}
