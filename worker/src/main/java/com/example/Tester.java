package com.example;

import static java.lang.Thread.sleep;

public class Tester {

    public void showMessage() throws InterruptedException {
        while(true){
            sleep(1000);
            System.out.println("Hello from worker");
        }
    }
}
