package study.wdw.thread.information;

/**
 * ��Calculator.java��ʵ��������TODO ��ʵ������
 * 
 * @author wdw 2013-5-29 ����12:49:17
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
