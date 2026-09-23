package Thread;

public class Worker2 implements Runnable{

    private SharedData sd1;

    public Worker2(SharedData sd1){
        this.sd1=sd1;
    }



    @Override
    public void run() {

        try {
            Thread.sleep(1000);

        }catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        sd1.setStatus(false);

    }

    public double calculateTotalPrice(String orderId, double discountPercentage){




        return 0.00;
    }

}
