package com.example.javavanilla;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThreadCompleatableFeature {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Programar ";
                });
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "é ");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "sofrer");

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3);
        combinedFuture.get();

        System.out.println(future1.get() + future2.get() + future3.get());

    }
}
