package multi_thread_samples;

import java.util.List;

public class Producer implements Runnable {
	List<Integer> arr;
	public Producer(List<Integer> arr) {
		this.arr=arr;
	}
	public void run() {
		synchronized (arr) {
			for(int i=0;i<15;i++) {
				if(arr.size()==3) {
					try {
						arr.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
					arr.add(i);
					System.out.println("Producing.... "+i);
					arr.notify();
				
			}
		}
	}
} 


