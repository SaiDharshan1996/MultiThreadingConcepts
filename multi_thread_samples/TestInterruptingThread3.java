package multi_thread_samples;

public class TestInterruptingThread3 {
public static void main(String[] args) {
	Su su=new Su();
	Thread t1=new Thread(su);
	t1.start();
	t1.interrupt();
}
}


		class Su extends Thread{
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("hi "+i);
				}
				
			}
		}