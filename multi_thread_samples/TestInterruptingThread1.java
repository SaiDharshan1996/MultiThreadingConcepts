package multi_thread_samples;

public class TestInterruptingThread1{
	public static void main(String[] args) {
		Sai s=new Sai();
		Thread t1=new Thread(s);
		t1.start();
		t1.interrupt();
	}
}
	class Sai extends Thread{
		
	
			public void run() {
			try {
				Thread.sleep(100);
			System.out.println("task");
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
}
}
