import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Zhengchuhao
 * @description:Callable接口实现
 * @create 2022/5/18 16:03
 **/
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable(3);
        FutureTask<String> f = new FutureTask<>(myCallable);
        Thread t = new Thread(f);
        t.start();

        try {
            String res = f.get();
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "result:" + sum;
    }
}
