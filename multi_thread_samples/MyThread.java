package multi_thread_samples;


public class MyThread {
	
	public static void main(String[] args) {
		Hello obj1=new Hello();
		//obj1.thread1();
		Hi obj2=new Hi();
		//obj2.thread1();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.run();
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		
	}
}
		 class Hello implements Runnable{
			public void thread1() {
				for(int i=0;i<5;i++) {
					System.out.println("This is 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
			}
			}
			@Override
			public void run() {
			
				thread1();
			
				
			}
		}
		 
		 
		 class Hi implements Runnable{
			 public void thread1() {
				 for(int i=0;i<5;i++) {
					 System.out.println("This is 2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				 }
			 }

			@Override
			public void run() {
				thread1();
				
			}
		 }

