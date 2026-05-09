package MultiThread;
public class MulThre2 implements Runnable{
    public void run() {
       for(int i=0;i<10;i++){
           System.out.println(i);
           try {
               Thread.sleep(500);
           } catch (Exception f) {}
       }
    }
}

class Main5 {
    public static void main(String[] args) {
        MyThread2 myth1 = new MyThread2();
        Runnable rb1 = () -> {
            for (int i = 65; i < 75; i++) {
                System.out.println((char) i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException f) {}
            }
        };
        Thread th1 = new Thread(myth1);
        Thread th2 = new Thread(rb1);
        th1.start();
        th2.start();
    }
}