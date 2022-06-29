package org.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculator(@RequestParam(name = "operation") String operation,
                             @RequestParam(name = "first") int firstOperator,
                             @RequestParam(name = "second") int secondOperator,
                             Model model){
        String answer = "";
        switch (operation){
            case "add":
                answer += firstOperator+secondOperator;
                break;
            case "multiply":
                answer += firstOperator*secondOperator;
                break;
            case "divide":
                answer += firstOperator / secondOperator;
                break;
            case "subtract":
                answer += firstOperator - secondOperator;
                break;
            default:
                answer += "Error: incorrect operation";
                break;
        }
        model.addAttribute("answer",
                "Answer is "+ answer);
        return "calculator";

    }
}
