package com.helloWorld;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2020(100_000);
        var report = new TaxReport(calculator);
    }
}