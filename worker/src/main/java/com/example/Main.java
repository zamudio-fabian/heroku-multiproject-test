package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var tester = new Tester();
        tester.showMessage();
    }
}