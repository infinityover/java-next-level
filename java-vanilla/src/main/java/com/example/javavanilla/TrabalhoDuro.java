package com.example.javavanilla;

public class TrabalhoDuro implements Runnable {

    @Override
    public void run() {
        System.out.println("Processamento duro - começo "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processamento bruto - fim "+Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }

}
