package homework30;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        IntThread thread1 = new IntThread( "Random int thread");
        thread1.start();
        Thread.sleep(200);
        CallableThread thread2 = new CallableThread("Thread for pool");
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        Future future = threadPoolExecutor.submit(thread2);
        System.out.println(future.get());
        threadPoolExecutor.shutdownNow();
    }
}
