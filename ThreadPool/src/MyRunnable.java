/**
 * @author Zhengchuhao
 * @description:
 * @create 2022/5/18 18:23
 **/
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + "：ok");
        }
        try {
            System.out.println(Thread.currentThread().getName() + "：开始休眠");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
