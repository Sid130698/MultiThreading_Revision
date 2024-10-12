package org.example.Threads;


public class Thread4ExecutorServiceA implements Runnable{
    private static int count = 0;
    private int id;
    @Override
    public void run() {
        System.out.println("#### < TASK - " + id + "> Starting ####");
        for(int i=10; i>0; i--){
            System.out.println("<" + id + "> TICK TICK - " + i);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("#### < TASK - " + id + "> COMPLETED ####");
    }
    public Thread4ExecutorServiceA(){
        this.id = ++count;
    }
}
