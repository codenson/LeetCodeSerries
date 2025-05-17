/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guero
 */
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentSum {
        public static void main(String[] args) throws InterruptedException{
            
            lin(); 
            
            concc(); 
        
        }
     public static void lin()  {
         long startTime = System.nanoTime();
         int count = 0; 
         for (int i = 0; i <=100000000; i++){
             count+= i; 
         
         }
         System.err.println("Count : "+ count);
         long endTime = System.nanoTime();
         long elapsedTime = endTime - startTime;
       
       System.out.println("Linear Elapsed Time (nanoseconds): " + elapsedTime);
     
     }
    public static void concc() throws InterruptedException {
        long startTime = System.nanoTime();
        int max = 100000000;
        AtomicInteger sum = new AtomicInteger(0);
        ExecutorService executor = Executors.newFixedThreadPool(4); // 4 concurrent threads

        for (int i = 1; i <= max; i++) {
            final int number = i;
            executor.submit(() -> {
                sum.addAndGet(number);
            });
        }

        executor.shutdown(); // Stop accepting new tasks
        executor.awaitTermination(1, TimeUnit.SECONDS); // Wait for completion

        System.out.println("Sum from 1 to 20 = " + sum.get());
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        
        System.out.println("Concc Elapsed Time (nanoseconds): " + elapsedTime);
    }
    
}
