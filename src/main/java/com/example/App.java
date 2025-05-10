package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube!");
    }

    // A method with a dummy issue for SonarQube to detect
    public String unusedMethod() {
        String unusedVar = "This is a unused variable";
        return "Hello";
    }
}
