package com.gsam;

public class App {
    public String getGreeting() {
        return "getGreeting: Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
