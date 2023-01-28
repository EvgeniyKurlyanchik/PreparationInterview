package com.example.preparationinterview.pingpong;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 20; i++) {
            executorService.execute(new Player("Ping"));
            executorService.execute(new Player("Pong"));
        }
        executorService.shutdown();
    }
}






