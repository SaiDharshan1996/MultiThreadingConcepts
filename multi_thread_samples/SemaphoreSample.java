package multi_thread_samples;

import java.util.concurrent.Semaphore;

public class SemaphoreSample implements Runnable {

	// max 1 people
	static Semaphore semaphore = new Semaphore(2);

	@Override
	public void run() {
		try {
			semaphore.acquire();
			for(int i=0;i<4;i++) {
				System.out.println(Thread.currentThread().getName()+"--"+i);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		semaphore.release();
	}
public static void main(String[] args) {
	SemaphoreSample sem=new SemaphoreSample();
	Thread t1=new Thread(sem);
	Thread t2=new Thread(sem);
	Thread t3=new Thread(sem);
	Thread t4=new Thread(sem);
	Thread t5=new Thread(sem);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
}
}