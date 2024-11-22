package Exception;
class MyRunnable implements Runnable {
   public void run() {
    int i = 0;
    while(i < 20){
        System.out.println("1 is running.");
        i++;
    }
    }
}


class MyThread extends Thread {
    public void run() {
        int i = 0;
        while(i < 20){
            System.out.println("2 is running.");
            i++;
        }       
    }
}

class ThreadDriver{

    public static void main(String[] args) {
        
        MyThread r = new MyThread();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(new MyThread());
       
        t1.start();
        t2.start();
    }

}


