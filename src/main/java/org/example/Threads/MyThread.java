package org.example.Threads;

public class MyThread implements Runnable{

    @Override
    public void run(){
       for(int i = 20;i>10;i--){
           try{
               Thread.sleep(1000);
               System.out.println("another thread - > " + i);
           }
           catch(Exception e){
               System.out.println("Thread Exception "+ e);
           }
       }
    }
}
