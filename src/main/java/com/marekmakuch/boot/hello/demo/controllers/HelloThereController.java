package com.marekmakuch.boot.hello.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloThereController {

    @RequestMapping("/")
    public String start() {
        return "startPage";
    }


    @RequestMapping("/sayHello")
    public String sayHello(Model model) {
        model.addAttribute("greeting", "Hello there");
        model.addAttribute("response", "General kenobi!");

        return "helloThere";
    }
}
