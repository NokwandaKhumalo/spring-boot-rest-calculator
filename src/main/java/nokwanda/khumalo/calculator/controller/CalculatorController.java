package nokwanda.khumalo.calculator.controller;

import nokwanda.khumalo.calculator.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add/{num1}/{num2}")
    public double add(@PathVariable double num1, double num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public double subtract(@PathVariable double num1, double num2) {
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public double multiply(@PathVariable double num1, double num2) throws Exception {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide/{num1}/{num2}")
    public double divide(@PathVariable double num1, double num2) throws Exception {
        return calculatorService.divide(num1, num2);
    }
}
