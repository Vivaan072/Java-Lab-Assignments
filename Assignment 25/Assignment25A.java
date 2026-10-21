
class NumberThread extends Thread {
    String name;

    NumberThread(String name) {
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

public class Assignment25A {
    public static void main(String[] args) throws InterruptedException {
        NumberThread t1 = new NumberThread("Thread 1");
        NumberThread t2 = new NumberThread("Thread 2");
        NumberThread t3 = new NumberThread("Thread 3");

        System.out.println("State: " + t1.getState());

        t1.start();
        t2.start();
        t3.start();

        System.out.println("State: " + t1.getState());

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final State: " + t1.getState());
        System.out.println("All threads completed.");
    }
}
