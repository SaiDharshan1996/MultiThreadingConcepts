package multi_thread_samples;

import java.util.concurrent.Semaphore;

public class MutexSample implements Runnable{
static Semaphore sem=new Semaphore(1);

@Override
public void run() {
	try {
		sem.acquire();
	
	for(int i=1;i<10;i++) {
		System.out.println(Thread.currentThread().getName()+"------------"+i);
	}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sem.release();
}

public static void main(String[] args) {
	MutexSample m=new MutexSample();
	Thread t1=new Thread(m);
	Thread t2=new Thread(m);
	t1.start();
	t2.start();
}
}
