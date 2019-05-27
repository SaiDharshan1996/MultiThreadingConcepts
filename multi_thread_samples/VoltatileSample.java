package multi_thread_samples;


public class VoltatileSample {
public static void main(String[] args) {
	Sample s=new Sample();
	Thread t1=new Thread(s);
	Thread t2=new Thread(s);
	t1.start();
	t2.start();
}
}

class Sample implements Runnable{
	volatile int count=0;
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			count++;
			System.out.println(Thread.currentThread().getName()+" count=> "+count);
		}
		
	}
	
}