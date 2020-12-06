package lesson5;

public class TestThread {
//        public volatile int i;


    public static void main(String[] args) {
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();

//        var myRun = new MyRunnable();
//        Thread t1 = new Thread(myRun);
//        Thread t2 = new MyThread(myRun);

        var t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        }, "Name");

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }}).start();



        t1.start();

//        t2.start();
    }
}
