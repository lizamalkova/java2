package lesson5;

public class TestSync {

    private int counter;

    public static void main(String[] args) {

        var testSync = new TestSync();

        var t1 = new Thread(() -> {testSync.incCounter();});
        var t2 = new Thread(() -> {testSync.incCounter();});

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(testSync.counter);

    }

    public synchronized void incCounter() {
        for (int i = 0; i < 100000; i++) {
            this.counter++;
        }
    }
}
