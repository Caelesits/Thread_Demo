import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Zhengchuhao
 * @description:
 * @create 2022/5/19 10:28
 **/
public class TimerDemo1 {
    public static void main(String[] args) {
        //1、创建ScheduledExecutorService线程池做为定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        //2、开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "AAA");
            }
        },0,2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "BBB");
            }
        },0,2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "CCC");
            }
        },0,2, TimeUnit.SECONDS);
    }
}
