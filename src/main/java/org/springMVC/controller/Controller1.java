package org.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name", required = false) String name,
                             Model model)
    {
        if (name == null)
            name = "username";
        model.addAttribute("greating", "Hello, " + name + "!");
        return "helloWorld";

    }
}
