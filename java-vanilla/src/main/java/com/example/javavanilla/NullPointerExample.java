package com.example.javavanilla;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class NullPointerExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String teste = null;
        teste.toString();
    }
}
