package study.wdw.thread.information;

/**
 * 类Calculator.java的实现描述：TODO 类实现描述
 * 
 * @author wdw 2013-5-29 上午12:49:17
 */
public class Calculator implements Runnable {

    private int number;

    public Calculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i * number);
        }
    }

}
