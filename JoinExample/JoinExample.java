package JoinExample;

public class JoinExample {
    public static void main(String[] args) {
        // create two threads
        Thread thread1 = new Thread(new Task("JoinExample.Task 1"));
        Thread thread2 = new Thread(new Task("JoinExample.Task 2"));

        // start both threads
        thread1.start();
        thread2.start();

        try {
            // wait for both threads to complete
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks have completed.");
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Starting " + name);

        // simulate some work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished " + name);
    }
}
