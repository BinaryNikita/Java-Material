package Exception;

class Priority extends Thread {
    
     public Priority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getPriority());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Priority p1 = new Priority("High Priority Thread");
        Priority p2 = new Priority("Low Priority Thread");

        p1.setPriority(Thread.MAX_PRIORITY); // Priority 10
        p2.setPriority(Thread.MIN_PRIORITY);  // Priority 1

        p1.start();
        p2.start();
    }
}

