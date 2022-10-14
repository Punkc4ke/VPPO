package com.example.calculator;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;




@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String CalculatorModelForm(Model model) {
        model.addAttribute("calculator", new CalculatorModel());
        return "Calculator";
    }

    @GetMapping("/calculatorR")
    public String CalculatorFormResultGet(@ModelAttribute @NonNull CalculatorModel calculatorModel, Model model) {
        double a = calculatorModel.getArgument1();
        double b = calculatorModel.getArgument2();
        double result;

        switch (calculatorModel.getOperation()) {
            case "plus":
                result = a + b;
                break;
            case "minus":
                result = a - b;
                break;
            case "umn":
                result = a * b;
                break;
            case "del":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calculatorModel.getOperation());
        }
        calculatorModel.setResult(String.valueOf(result));
        model.addAttribute("calculator", calculatorModel);
        return "Calculator";
    }

    @PostMapping("/calculator")
    public String CalculatorFormResultSet(@ModelAttribute CalculatorModel calculatorModel, Model model) {
        double a = calculatorModel.getArgument1();
        double b = calculatorModel.getArgument2();
        double result;

        switch (calculatorModel.getOperation()) {
            case "plus":
                result = a + b;
                break;
            case "minus":
                result = a - b;
                break;
            case "umn":
                result = a * b;
                break;
            case "del":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calculatorModel.getOperation());
        }

        calculatorModel.setResult(String.valueOf(result));

        model.addAttribute("calculator", calculatorModel);
        return "Calculator";
    }
}
