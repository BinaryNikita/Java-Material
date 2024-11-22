package Multithreading;

// Define a class that extends Thread
class MyThread extends Thread {
    
    // Override the run() method to define the thread's behavior
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate some task
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Create multiple instances of MyThread
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        // Start the threads
        thread1.start();
        thread2.start();
        
        // Main thread continues to run parallel to the created threads
        System.out.println("Main thread finished.");
    }
}

