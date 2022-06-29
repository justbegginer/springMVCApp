package org.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculator(@RequestParam(name = "operation") String operation,
                             @RequestParam(name = "first") int firstOperator,
                             @RequestParam(name = "second") int secondOperator,
                             Model model){
        int answer;
        System.out.println("OPERATION "+operation);
        if (Objects.equals(operation, "add")){
            answer = firstOperator+secondOperator;
        }
        else if(Objects.equals(operation, "subtract")){
            answer = firstOperator - secondOperator;
        }
        else if(Objects.equals(operation, "multiply")){
            answer = firstOperator*secondOperator;
        }
        else if(Objects.equals(operation, "divide")){
            answer = firstOperator/secondOperator;
        }
        else{
            answer = 0;
        }
        if (answer == 0){
            model.addAttribute("answer", "Error: incorrect operation");
        }
        else{
            model.addAttribute("answer",
                    "Answer is " + answer);
        }
        return "calculator";

    }
}
