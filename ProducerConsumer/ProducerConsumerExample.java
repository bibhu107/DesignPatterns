package ProducerConsumer;
//
//The producer-consumer problem involves two processes,
//the producer and the consumer, which share a common
//buffer. The producer produces items and puts them into the buffer,
//while the consumer takes items out of the buffer and consumes them.
//The problem is to ensure that the producer does not try to add items to the buffer when it is full and that the consumer
//does not try to remove items from the buffer when it is empty. This can be solved using synchronization primitives like mutexes and semaphores.

public class ProducerConsumerExample {
	public static void  main(String[] args) throws InterruptedException {
		ProducerConsumer producerConsumer = new ProducerConsumer();
		producerConsumer.run();
	}
}

