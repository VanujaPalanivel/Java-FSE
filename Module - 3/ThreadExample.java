class MessagePrinter implements Runnable {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
            for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " (" + i + ")");
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MessagePrinter("Hello from Thread 1"));
        Thread thread2 = new Thread(new MessagePrinter("Hello from Thread 2"));

        
        thread1.start();
        thread2.start();
    }
}
