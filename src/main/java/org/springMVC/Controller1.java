package org.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
    @GetMapping("/hello")
    public String helloWorld(){
        return "helloWorld";
    }
}
