package com.helloWorld;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = { new UIControl(), new TextBox(), new Checkbox() };
        for (var control: controls) {
//            each array object has its own render method
            control.render();
        }
    }
}