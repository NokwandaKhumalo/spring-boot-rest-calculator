package nokwanda.khumalo.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) throws Exception {
        try {
            return num1 * num2;
        } catch (Exception e) {
            throw new Exception("Failed to do multiplication, please check your input!");
        }
    }

    public double divide(double num1, double num2) throws Exception {
        try {
            return num1 / num2;
        } catch (Exception e) {
            throw new Exception("Failed to do division, please check your input!");
        }
    }
}
