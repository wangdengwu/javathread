package study.wdw.thread.create;

/**
 * ��Main.java��ʵ��������TODO ��ʵ������
 * 
 * @author wdw 2013-5-29 ����12:46:58
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
