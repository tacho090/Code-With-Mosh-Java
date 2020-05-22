package com.helloWorld;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport() {
//        example of tightly coupled code
        calculator = new TaxCalculator(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
