package threadSome;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable {
	public static ReentrantLock lock = new ReentrantLock();
	public static Condition condition = lock.newCondition(); //生产与当前锁绑定的condition
	@Override
	public void run() {
		try {
			lock.lock();
			condition.await();
			System.out.println("thread is go on!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ReentrantLockTest lock2 = new ReentrantLockTest();
		Thread t1 = new Thread(lock2);
		t1.start();
		Thread.sleep(2000);
		
		lock.lock();
		condition.signal();
		lock.unlock();
		
	}
}
