package com.helloWorld;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("Text box");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) { this.text = text; }

    public void clear() { text = ""; }
}