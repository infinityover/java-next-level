package com.example.javavanilla;

public class ThreadSimples {

    public static void main(String[] args) {

        Thread t1 = new Thread(new TrabalhoDuro(), "t1");
        Thread t2 = new Thread(new TrabalhoDuro(), "t2");
        System.out.println("Começando a trabalhar duro");
        t1.start();
        t2.start();

    }

}
