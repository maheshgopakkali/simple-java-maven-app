package com.mycompany.app;

/**
 * Hello world!
 testing this line, again adding the change
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        System.out.println("Hello");
        System.out.println("Hello12");
        return MESSAGE;
    }
}
