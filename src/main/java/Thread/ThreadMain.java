package Thread;
import java.util.concurrent.*;
import java.math.BigDecimal;

public class ThreadMain {
    public static void main(String[] args) {

//        SharedData sd1 = new SharedData();
//        Worker w1 = new Worker(sd1);
//        Thread t1 = new Thread(w1,"worker1");
//
//        Worker2 w2 = new Worker2(sd1);
//        Thread t2 = new Thread(w2,"worker2");
//
//        t1.start();
//        t2.start();
//
//        try {
//
//            t1.join();
//
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        Thread t1 = new ReportThread("report-thread-1");
        t1.start();

        EmailThread emailThread = new EmailThread();
//        Thread t2 = new Thread(emailThread, "emailThread");
//        t2.start();

        try {

            ExecutorService executorService1 = Executors.newFixedThreadPool(2);

            PriceCalculation priceCalculation = new PriceCalculation();

            Future<BigDecimal> priceFuture =  executorService1.submit(priceCalculation);
            executorService1.submit(emailThread);

            executorService1.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });

            System.out.println(priceFuture.get());




            executorService1.shutdown();
        }catch(Exception ie){
            System.out.println(ie.getMessage());
        }


//        Worker w2 = new Worker();
//        new Thread(w2).start();
//        w2.stoploop();


    }
}
