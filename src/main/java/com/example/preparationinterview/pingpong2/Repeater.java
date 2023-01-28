package com.example.preparationinterview.pingpong2;

public class Repeater {
    static volatile String currentLetter = "ping";
    static Object mon = new Object();

    public static void main(String[] args) {
        new Thread(() -> {

            try {
                for (int i = 0; i < 20; i++) {
                    synchronized (mon) {
                        while (currentLetter != "ping") {
                            mon.wait();

                        }
                        System.out.println("ping");
                        currentLetter = "pong";
                        mon.notifyAll();

                    }

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {

            try {
                for (int i = 0; i < 20; i++) {
                    synchronized (mon) {
                        while (currentLetter != "pong") {
                            mon.wait();
                        }
                        System.out.println("pong");
                        currentLetter = "ping";
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
