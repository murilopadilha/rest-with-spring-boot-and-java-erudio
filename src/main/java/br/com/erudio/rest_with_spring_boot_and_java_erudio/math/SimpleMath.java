package br.com.erudio.rest_with_spring_boot_and_java_erudio.math;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {

        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {

        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {

        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {

        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {

        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(Double number) {

        return Math.sqrt(number);
    }


}
