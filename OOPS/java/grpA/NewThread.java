import java.lang.reflect.InaccessibleObjectException;

public class NewThread {

    public static void main(String[] args) throws InterruptedException {

        MyThread mythread = new MyThread("hello", 2000);

        mythread.start();

    }

}

class MyThread extends Thread {
    private String message;
    private int timeQuantum;

    public MyThread(String message, int timeQuantum) {
        this.message = message;
        this.timeQuantum = timeQuantum;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                System.out.println(message);
                Thread.sleep(timeQuantum);
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }

    }

}
