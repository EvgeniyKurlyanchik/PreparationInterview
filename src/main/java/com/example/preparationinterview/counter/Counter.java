package com.example.preparationinterview.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
        Thread t2 = new Thread(myThread);
        t2.start();
        Thread.sleep(500);

        System.out.println(myThread.getX());

    }
}

    class MyThread extends Thread{
    Lock lock =new ReentrantLock();
        int x =0;
        public  void run(){
            lock.lock();
            for (int i = 0; i < 10000; i++)
                x++;
            lock.unlock();
            }
        public int getX() {
            return x;
            }
        }




