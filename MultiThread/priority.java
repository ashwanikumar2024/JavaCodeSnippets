package MultiThread;

public class priority {
    public static void main(String[] args) {
        Runnable rb1 = ()->{
            for(int i=65;i<75;i++){
                System.out.println((char)i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException f) {}
            }
        };

        Thread t1 = new Thread(rb1);
        Thread t2 = new Thread(rb1);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
