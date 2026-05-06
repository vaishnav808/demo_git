class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from MyThread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello from MyRunnable: " + i);
            try {
                Thread.sleep(100); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class Demo {
    public static void main(String [] args){
       MyThread t1 = new MyThread();
      
       Thread r1 = new  Thread(new MyRunnable());

       System.out.println(t1.getPriority());
       t1.setPriority(Thread.MAX_PRIORITY);
       r1.setPriority(Thread.MIN_PRIORITY);
    t1.start();
       r1.start();
       t1.run();
       
       r1.run();

    }

}
