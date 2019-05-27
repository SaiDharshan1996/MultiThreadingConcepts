package multi_thread_samples;

import java.util.ArrayList;
import java.util.List;

public class SynchroniseSample {
	public static void main(String[] args) {
		List<String> arr=new ArrayList<String>();
		Th1 t1=new Th1(arr);
		Th2 t2=new Th2(arr);
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		tt1.start();
		
		tt2.start();
	
	}
}

		class Th1 implements Runnable{
			
			List<String> arr;
			public Th1(List<String> arr)  {
				this.arr=arr;
			}
			
			@Override
			public void run() {
				for(int i=10;i<15;i++) {
					synchronized (arr) {
						
										
					arr.add("i");
					System.out.println("add "+i);
					}
				}
			}
			
		}
		
		
		class Th2 implements Runnable{
			
			List<String> arr;
			public Th2(List<String> arr) {
				this.arr=arr;
			}
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					
						
					
					arr.remove("i");
					System.out.println("remove"+i);
				
				}
			}
		}