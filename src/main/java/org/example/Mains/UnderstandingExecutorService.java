package org.example.Mains;

import org.example.Threads.Thread4ExecutorServiceA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnderstandingExecutorService {
    public static void main(String[] args) {
        System.out.println("Main thread starts here....");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i< 3 ; i++){
            executorService.submit(new Thread4ExecutorServiceA());
        }
        System.out.println("Main thread ends here....");
    }
}
