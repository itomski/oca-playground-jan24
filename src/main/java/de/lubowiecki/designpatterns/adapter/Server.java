package de.lubowiecki.designpatterns.adapter;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private ExecutorService service;

    public Server() {
        service = Executors.newSingleThreadExecutor();
    }

    public void receive(Message m) {

        service.execute(() -> {

            m.compute();

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public void stop() {
        service.shutdown();
    }
}
