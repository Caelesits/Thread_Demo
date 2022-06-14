import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Zhengchuhao
 * @description:
 * @create 2022/5/18 23:38
 **/
public class TimerDemo {
    public static void main(String[] args) {
        //Timer是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入。
        //Timer线程死掉会影响后续任务的进行
        Timer t = new Timer();

        t.schedule(new TimerTask(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + new Date());
            }
        },3000,2000);
    }
}
