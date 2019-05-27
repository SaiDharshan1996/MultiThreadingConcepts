package multi_thread_samples;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockRentrantLock {
public static void main(String[] args) {
	ABC abc=new ABC();
	
	Thread t1=new Thread(abc);
	Thread t2=new Thread(abc);
	t1.start();
	t2.start();
}
}

		class ABC implements Runnable {
			static Lock lock=new ReentrantLock();
			public void run() {
				lock.lock();
				for(int i=0;i<5;i++) {
					System.out.println(Thread.currentThread().getName()+"---------"+i);
					}
				lock.unlock();
			}
		}
		
		
		class CGF implements Runnable {
			static Lock lock=new ReentrantLock();
			public void run() {
				lock.lock();
				for(int i=5;i<10;i++) {
					System.out.println("Hello "+i);
				}
				lock.unlock();
			}
		}