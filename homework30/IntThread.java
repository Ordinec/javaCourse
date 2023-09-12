package homework30;

import java.util.Random;

public class IntThread implements Runnable {
    private Thread thread;
    private final String threadName;

    IntThread(String name) {
        threadName = name;
    }

    public void run() {
        try {
            while(true) {
                Random random = new Random();
                int outputInt = random.nextInt(10);
                System.out.println(outputInt);
                if(outputInt == 5){
                    thread.interrupt();
                }
                // Let the thread sleep for a while for more smooth output
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
    }

    public void start () {
        if (thread == null) {
            thread = new Thread (this, threadName);
            thread.start();
        }
    }
}
