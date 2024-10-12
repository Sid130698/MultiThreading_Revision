package org.example.Mains;

import org.example.Threads.MyThread;
import org.example.Threads.MyThreadExtend;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();
        MyThreadExtend t2 = new MyThreadExtend();
        t2.start();
        System.out.println("program Started");
        Thread currThread = Thread.currentThread();
        System.out.println("Current Running Thread: "+currThread.getName());
        currThread.setName("MyMain");
        System.out.println(currThread.getName());
        System.out.println(currThread.getId());
    }
}