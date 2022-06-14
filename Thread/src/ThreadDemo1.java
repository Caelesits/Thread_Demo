/**
 * @author Zhengchuhao
 * @description:掌握多线程创建方式之一Thread
 * @create 2022/5/18 15:39
 **/
public class ThreadDemo1 {
    public static void main(String[] args) {
        //单继承Thread类，存在单继承的局限性，优点是编码简单易读，继承Thread类后不能继承其他类，不利于拓展
        //多态
        Thread t = new MyThread();
        //直接调run会被当成普通方法执行，此时还是相当于单线程运行
        t.start();

    }
}

class MyThread extends Thread {
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出" + i);
        }
    }
}
