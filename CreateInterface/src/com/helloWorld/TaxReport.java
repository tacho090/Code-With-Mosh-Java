package com.helloWorld;

public class TaxReport {
    private TaxCalculator2020 calculator;

    public TaxReport() {
//        example of tightly coupled code
        calculator = new TaxCalculator2020(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
