package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class ProducerConsumer {
	private Semaphore mutex = new Semaphore(1);
	private Semaphore empty = new Semaphore(10);
	private Semaphore full = new Semaphore(0);
	private int[] buffer = new int[5];
	private int in = 0, out = 0;

	public void produce(int item) throws InterruptedException {
		empty.acquire();
		mutex.acquire();
		buffer[in] = item;
		in = (in + 1) % 10;
		mutex.release();
		full.release();
		System.out.println("Produced :"+item);
	}

	public int consume() throws InterruptedException {
		full.acquire();
		mutex.acquire();
		int item = buffer[out];
		out = (out + 1) % 10;
		mutex.release();
		empty.release();
		System.out.println("Consumed :"+item);
		return item;
	}

	public void run() throws InterruptedException{
		produce(1);
		produce(2);
		produce(3);
		produce(4);
		produce(5);
		produce(6);
		consume();
	}
}

