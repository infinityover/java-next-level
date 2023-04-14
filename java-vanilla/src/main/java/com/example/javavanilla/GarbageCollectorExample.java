package com.example.javavanilla;

import java.util.concurrent.ExecutionException;

public class GarbageCollectorExample {

    public static void main(String[] args) throws InterruptedException {
        long m1, m2, m3;
        Runtime rt = Runtime.getRuntime();
        for(int i = 0; i < 3; i++)
        {
            m1 = rt.freeMemory();

            createObjects(500);
            Thread.sleep(100);
            m2 = rt.freeMemory();
            System.gc();
            Thread.sleep(100);
            m3 = rt.freeMemory();
            System.out.println("m1 = " + m1 + ", m2 = " + m2 + ", m3 = " +m3 + "\nMemory freed by gc() =  " + (m3 - m2));
            System.out.println("-------------------------");
        }
    }
    public static void createObjects(int count)
    {
        for(int i = 0; i < count; i++)
        {
            int j = 10;
        }
    }
}
