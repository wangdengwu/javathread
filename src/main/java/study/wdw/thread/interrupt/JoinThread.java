package study.wdw.thread.interrupt;

/**
 * 
 * @author wangdengwu
 * @since 2012-2-27
 */
public class JoinThread implements Runnable {

	@Override
	public void run() {
		Thread sleep = new Thread(new SleepThread());
		try {
			sleep.join();
		} catch (InterruptedException e) {
			// do nothing
			System.out.println("JoinThread catch InterruptedException!!");
		}
	}

}
