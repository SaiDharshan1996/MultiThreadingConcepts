package multi_thread_samples;

public class TestInterruptingThread4 {
public static void main(String[] args) {
		It i=new It() ;
		Thread t1=new Thread(i);
		Thread t2=new Thread(i);
		t1.start();
		t1.interrupt();
		t2.start();
		
}
}


			class It extends Thread{
				public void run() {
					for(int i=0;i<=2;i++) {
						if(Thread.interrupted()){
							System.out.println("code for isinterrupted thread");
						}else {
							System.out.println("code for normal thread");
						}
					}
				}
			}