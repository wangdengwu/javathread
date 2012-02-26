package study.wdw.thread;

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
