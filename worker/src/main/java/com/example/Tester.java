package com.example;

public class Tester {

    public void showMessage() throws InterruptedException {
        while(true){
            wait(1000);
            System.out.println("Hello from worker");
        }
    }
}
