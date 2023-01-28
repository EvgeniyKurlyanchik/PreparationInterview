package com.example.preparationinterview.pingpong;

class  Player extends Thread {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public synchronized void run() {
        System.out.println(name);
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}