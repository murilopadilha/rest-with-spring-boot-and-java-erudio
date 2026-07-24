package br.com.erudio.rest_with_spring_boot_and_java_erudio.request.converters;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if(strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        String number = strNumber.replace(",", "."); // R$ 5,00 - USD 5.0

        return Double.parseDouble(number);
    }

    public static boolean isNumberic(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) {
            return false;
        }

        String number = strNumber.replace(",", "."); // R$ 5,00 - USD 5.0

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
