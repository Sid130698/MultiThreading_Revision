package org.example.Threads;

import org.example.classes.Company;

public class Consumer extends Thread{

    Company company;

    public Consumer(Company company){
        this.company = company;
    }
    @Override
    public void run() {
        while(true){

            try {
                this.company.consumeItem();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
