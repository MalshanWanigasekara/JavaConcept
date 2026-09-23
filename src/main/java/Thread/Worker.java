package Thread;

public class Worker implements Runnable{

    private SharedData sd1;

    int count = 0;

    public Worker(SharedData sd1){
        this.sd1=sd1;
    }



    @Override
    public void run() {
        while(sd1.getStatus()){
            System.out.println("running "+count++);

        }

    }

    public void stoploop(){
        sd1.setStatus(false);
    }
}
