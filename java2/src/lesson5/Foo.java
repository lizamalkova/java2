package lesson5;

public class Foo {

    private final int STEP = 10;
    private final int DELAY = 500;

    private Object lock = new Object();


    public static void main(String[] args) {

        var foo = new Foo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                foo.methodA();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                foo.methodB();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                foo.methodB();
            }
        }).start();
    }

    public synchronized void methodA() {
        System.out.println("Start A");

        for (int i = 0; i < STEP; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();
        System.out.println("End A");
    }

    public void methodB() {
        synchronized (lock) {
            System.out.println("Start B");

            for (int i = 0; i < STEP; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println();
            System.out.println("End B");
        }
    }
}
