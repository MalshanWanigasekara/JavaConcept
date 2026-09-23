package Thread;

public class SharedData {

    private volatile boolean status = true;


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
