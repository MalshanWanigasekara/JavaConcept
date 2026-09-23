package Thread;

public class ThreadMain {
    public static void main(String[] args) {

        SharedData sd1 = new SharedData();
        Worker w1 = new Worker(sd1);
        Thread t1 = new Thread(w1,"worker1");

        Worker2 w2 = new Worker2(sd1);
        Thread t2 = new Thread(w2,"worker2");

        t1.start();
        t2.start();

        try {

            t1.join();

            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//        Worker w2 = new Worker();
//        new Thread(w2).start();
//        w2.stoploop();


    }
}
