package study.wdw.thread.interrupt;

/**
 * 
 * @author wangdengwu
 * @since 2012-2-26
 */
public class WaitThread implements Runnable {

	@Override
	public void run() {
		try {
			wait();
		} catch (InterruptedException e) {
			// do nothing
			System.out.println("WaitThread catch InterruptedException!!");
		}

	}

}
