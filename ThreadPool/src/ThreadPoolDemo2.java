import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Zhengchuhao
 * @description:
 * @create 2022/5/18 23:26
 **/
public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        //任务过多会无限产生任务从而导致OOM  out of memory 问题 风险
        //允许的请求队列长度为Integer.MAX_VALUE，可能会堆积大量请求，从而导致OOM
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorService pool2 = Executors.newSingleThreadExecutor();
        //允许的创建线程数量为Integer.MAX_VALUE，可能会创建大量的线程，从而导致OOM
        ExecutorService pool1 = Executors.newScheduledThreadPool(3);
        ExecutorService pool3 = Executors.newCachedThreadPool();

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());

    }
}
