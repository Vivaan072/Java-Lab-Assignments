
class NumberTask implements Runnable {
    String name;

    NumberTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new NumberTask("Task 1"));
        Thread t2 = new Thread(new NumberTask("Task 2"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both tasks completed.");
    }
}
