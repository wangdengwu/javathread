package study.wdw.thread;

import junit.framework.TestCase;
import study.wdw.thread.lock.LockThread;

/**
 * 测试Lock
 * 
 * @author wangdengwu
 * @since 2012-2-27
 */
public class LockTest extends TestCase {
	public void testLock() throws InterruptedException {
		LockThread lockThread = new LockThread();
		Thread thread1 = new Thread(lockThread);
		Thread thread2 = new Thread(lockThread);
		thread1.start();
		thread2.start();
		Thread.sleep(1000 * 60);
		lockThread.setDone();
		assertEquals(0, lockThread.i);
	}
}
