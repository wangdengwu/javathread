package study.wdw.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock代替synchronized
 * 
 * @author wangdengwu
 * @since 2012-2-27
 */
public class LockThread implements Runnable {
	public int i = 0;
	private Lock lock = new ReentrantLock();// 私有锁
	private volatile boolean done = false;// 使用volatile标记可见性
	@Override
	public void run() {
		while (!done) {
			doMath();
		}
	}

	// 此方法如果不同步则有可能使i不为0
	public void doMath() {
		try {
			lock.lock();
			i++;
			i--;
		} finally {
			lock.unlock();
		}
	}

	public void setDone() {
		done = true;
	}
}
