package org.example.Threads;

public class MyThreadExtend extends Thread{

    @Override
    public void run(){
        for(int i =1;i<=10;i++){
            System.out.println("value of i is "+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Exception happened: "+ e);
            }
        }
    }
}
