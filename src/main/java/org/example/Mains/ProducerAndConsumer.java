package org.example.Mains;

import org.example.Threads.Consumer;
import org.example.Threads.Producer;
import org.example.classes.Company;



public class ProducerAndConsumer {
    public static void main(String[] args) {
        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();
    }
}
