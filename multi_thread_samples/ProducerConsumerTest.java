package multi_thread_samples;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		
	
List<Integer> arr=new ArrayList<Integer>();
Thread producer=new Thread(new Producer(arr));
Thread consumer=new Thread(new Consumer(arr));
producer.start();
consumer.start();
}
}