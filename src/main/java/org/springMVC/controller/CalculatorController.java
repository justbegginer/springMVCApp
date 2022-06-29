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
        final String answer = "answer";
        switch (operation){
            case "add":
                model.addAttribute(answer,
                        "Answer is " +(firstOperator+secondOperator));
                break;
            case "multiply":
                model.addAttribute(answer,
                        "Answer is " + (firstOperator*secondOperator));
                break;
            case "divide":
                model.addAttribute(answer,
                        "Answer is " + (firstOperator/secondOperator));
                break;
            case "subtract":
                model.addAttribute(answer,
                        "Answer is " + (firstOperator - secondOperator));
                break;
            default:
                model.addAttribute(answer,
                        "Error: incorrect operation");
                break;
        }
        return "calculator";

    }
}
