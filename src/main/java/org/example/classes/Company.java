package org.example.classes;

public class Company {
    int n;
    boolean chanceProducer= true;
    synchronized public void produceItem(int n) throws InterruptedException {
        if(chanceProducer){
            this.n = n;
            System.out.println("produced : "+ this.n);
            notify();
            chanceProducer = false;

        }
        else{
            wait();
        }
    }
    synchronized public int consumeItem() throws InterruptedException{
        if(chanceProducer){
            wait();
        }
            System.out.println("Consumed : " + this.n);
            notify();
            chanceProducer = true;
            return this.n;

    }
}
