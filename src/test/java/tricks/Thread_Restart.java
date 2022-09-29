package tricks;

public class Thread_Restart implements Runnable{

    public static void main(String[] args) {
        Thread_Restart T1 = new Thread_Restart();


//        synchronized (T1) {
            T1.run();
            T1.run();

//        }
    }

    public void run(){

        System.out.println("Thread is running..");
    }

}
