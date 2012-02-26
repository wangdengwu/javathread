package study.wdw.thread;

/**
 * 
 * @author wangdengwu
 * @since 2012-2-26
 */
public class SleepThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000 * 60);
		} catch (InterruptedException e) {
			// do nothing
			System.out.println("SleepThread catch InterruptedException!!");
		}
	}

}
