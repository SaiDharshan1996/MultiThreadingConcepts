package multi_thread_samples;

public class TestInterruptingThread2 {
	public static void main(String[] args) {
		S s=new S();
		Thread t1=new Thread(s);
		t1.start();
		t1.interrupt();
	}
}
	

		class S extends Thread{
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println("task");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread is running");
			}
		}