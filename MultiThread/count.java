package MultiThread;

import java.util.concurrent.SynchronousQueue;
//synchronization of object level.
//Only one thread can change only one object at a time due to Race condition.
public class count {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}
class Main4{
    public static void main(String[] args){
        count obj1 =  new count();
        Thread th1 = new Thread(()->{
            for(int i=0;i<100000;i++) obj1.increment();
        });
        Thread th2 = new Thread(()->{
            for(int i=0;i<100000;i++) obj1.increment();
        });

        th1.start();
        th2.start();
        try{
            th1.join();
            th2.join();
        }catch(InterruptedException f){}
        System.out.println(obj1.count);
    }
}