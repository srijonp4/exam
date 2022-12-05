
public class THREAD07 {
    public static void main(String[] args) throws InterruptedException {

        ThreadTester red = new ThreadTester("good morning", 1000);
        Thread redThread = new Thread(red);
        redThread.start();
        ThreadTester green = new ThreadTester("Hello", 2000);
        Thread greenThread = new Thread(green);
        greenThread.start();
        Bye bye = new Bye();
        bye.start();

    }
}

class ThreadTester implements Runnable {

    public String name;
    public int timeframe;

    public ThreadTester(String name, int timeframe) {
        this.name = name;
        this.timeframe = timeframe;
    }

    public void run() {
        for (int i = 1; i != 0; i++) {
            System.out.println(name);
            try {

                Thread.sleep(timeframe);
            } catch (InterruptedException e) {

                throw new RuntimeException(e.getMessage());

            }
        }
    }
}

class Bye extends Thread {

    public void run() {
        while (true) {
            try {

                System.out.println("bye");
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }

}
