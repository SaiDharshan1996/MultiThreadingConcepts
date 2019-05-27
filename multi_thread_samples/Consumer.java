package multi_thread_samples;

import java.util.List;

public class Consumer implements Runnable {
List<Integer> arr;
public Consumer(List<Integer> arr) {
	this.arr=arr;
}
@Override
public void run() {
	synchronized (arr) {
		while(true) {
			if(arr.size()==0) {
				try {
					arr.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				int x = arr.remove(0);
				System.out.println("Consuming... "+x);
				arr.notify();
			}
		}
	}
	
}
}
