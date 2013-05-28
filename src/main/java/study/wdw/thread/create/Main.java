package study.wdw.thread.create;

/**
 * 类Main.java的实现描述：TODO 类实现描述
 * 
 * @author wdw 2013-5-29 上午12:46:58
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Calculator calculator = new Calculator(i);
            Thread thread = new Thread(calculator);
            thread.start();
        }
    }

}
