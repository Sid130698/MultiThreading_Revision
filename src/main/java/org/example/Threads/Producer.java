package org.example.Threads;

import org.example.classes.Company;

public class Producer extends Thread{

    Company company;
    public Producer(Company company){
        this.company=company;
    }

    @Override
    public void run(){
        int i =1;
        while(true){

            try {
                this.company.produceItem(i);
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
