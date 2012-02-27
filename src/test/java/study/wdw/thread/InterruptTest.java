package study.wdw.thread;

import study.wdw.thread.interrupt.JoinThread;
import study.wdw.thread.interrupt.SleepThread;
import study.wdw.thread.interrupt.WaitThread;
import junit.framework.TestCase;

/**
 * 
 * @author wangdengwu
 * @since 2012-2-26
 */
public class InterruptTest extends TestCase {
	/**
	 * test Thread sleep
	 */
	public void testInterruptWithSleep() {
		Thread sleep = new Thread(new SleepThread());
		sleep.start();
		sleep.interrupt();
		assertTrue(sleep.isInterrupted());
	}

	/**
	 * test Thread wait
	 */
	public void testInterruptWithWait() {
		Thread wait = new Thread(new WaitThread());
		wait.start();
		wait.interrupt();
		assertTrue(wait.isInterrupted());
	}

	/**
	 * test Thread join
	 */
	public void testInterruptWithJoin() {
		Thread join = new Thread(new JoinThread());
		join.start();
		join.interrupt();
		assertTrue(join.isInterrupted());
	}
}
