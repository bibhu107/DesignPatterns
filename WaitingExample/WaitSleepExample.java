package WaitingExample;

public class WaitSleepExample {
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1 is running and waiting...");
                try {
                    lock.wait(); // thread1 releases the lock and waits for another thread to notify it
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 has been notified and is resuming...");
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 is running and notifying other threads...");
                lock.notifyAll(); // wakes up all threads that are waiting on the lock
            }
        });

        thread1.start();
        Thread.sleep(1000); // pause the main thread for 1 second to give thread1 a chance to start and wait
        thread2.start();
    }
}
