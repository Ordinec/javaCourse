package homework30;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable {
    private final String threadName;

    CallableThread(String name) {
        threadName = name;
    }

    @Override
    public Integer call() throws ExecutionException, InterruptedException {
        Callable task = () -> {
            Random random = new Random();
            return random.nextInt(50);
        };
        FutureTask<Integer> future = new FutureTask<>(task);
        new Thread(future).start();
        Thread.sleep(50);
        return future.get();
    }
}
