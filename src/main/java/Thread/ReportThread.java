package Thread;


public class ReportThread extends Thread{

    public ReportThread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
