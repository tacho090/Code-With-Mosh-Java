package com.helloWorld;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
//        Object is being cast to its parent
        var textBox = new TextBox();
        show(textBox);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            //        this is known as downcasting
            var textbox = (TextBox)control;
            textbox.setText("Hello world");
            System.out.println(control);
        }
    }
}