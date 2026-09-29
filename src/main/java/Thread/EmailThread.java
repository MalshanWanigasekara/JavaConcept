package Thread;

public class EmailThread implements Runnable{

    @Override
    public void run(){
        System.out.println("Sending Email in : "+ Thread.currentThread().getName());
    }
}
