import java.util.concurrent.*;

/**
 * @author Zhengchuhao
 * @description:线程池使用
 * @create 2022/5/18 18:12
 **/
public class ThreadPoolDemo {
    //临时线程什么时候创建？
    //新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
    //什么时候会开始拒绝任务？
    //核心线程和临时线程都在忙，任务队列也满了，新的任务过来时才开始任务拒绝
    public static void main(String[] args) {
        //1、创建线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3,
                5,
                6,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //2、给任务线程池处理
        Runnable target = new MyRunnable();
        //核心线程
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //在规定任务队列内
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //创建剩下的临时线程
        pool.execute(target);
        pool.execute(target);

        //拒绝策略触发
        pool.execute(target);



    }
}
