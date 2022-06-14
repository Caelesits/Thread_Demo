/**
 * @author Zhengchuhao
 * @description:Runnable接口
 * @create 2022/5/18 15:53
 **/
public class ThreadDemo2 {
    //线程任务类只是实现了接口，可以继承类和实现接口，扩展性强
    //多一层对象包装，如果线程有执行结果是不可以直接返回的
    public static void main(String[] args) {
        //创建一个任务对象
        Runnable target = new MyRunnable();
        //把任务对象交给Thread处理
        Thread t = new Thread(target);
        //启动线程
        t.start();
    }
}

//定义一个线程任务类 实现Runnable接口
class MyRunnable implements Runnable{
    //重写run方法，定义线程执行什么任务
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("子线程执行输出" + i);
        }
    }
}
